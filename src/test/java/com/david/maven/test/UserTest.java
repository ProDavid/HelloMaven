package com.david.maven.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.david.maven.pojo.user.User;
import com.david.maven.util.MyBatisConnUtil;

public class UserTest {
	Logger logger = LoggerFactory.getLogger(UserTest.class);
	
	@Test
	public void testFindUserById(){
		SqlSession session = MyBatisConnUtil.getMybatisConn();
		
		String statement = "userMapper.getUserById";
		User u = session.selectOne(statement, 1);
		
		logger.info("user:" + u);
	}
}
