package com.david.maven.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.david.maven.pojo.user.User;
import com.david.maven.util.MyBatisConnUtil;

public class UserTest {
	Logger logger = LoggerFactory.getLogger(UserTest.class);
	SqlSession session = null;

	@Test
	public void testFindUserById() {
		session = MyBatisConnUtil.getMybatisConn();

		String statement = "userMapper.getUserById";
		User u = session.selectOne(statement, 1);
		closeSession();

		logger.info("user:" + u);
	}

	@Test
	public void testFindUserAll() {
		session = MyBatisConnUtil.getMybatisConn();

		String statement = "userMapper.findUserAll";
		List<User> uList = session.selectList(statement);
		closeSession();

		logger.info("userList:" + uList);
	}
	
	@Test
	public void testSaveUser(){
		session = MyBatisConnUtil.getMybatisConn();
		
		String statement = "userMapper.saveUser";
		User user = new User();
		user.setUser_name("教授");
		user.setUser_age(20);
		user.setUser_gender(0);
		
		int ret = session.insert(statement, user);
		session.commit();
		logger.info(ret + "");
	}

	private void closeSession() {
		MyBatisConnUtil.sessionClose(session);
	}
}
