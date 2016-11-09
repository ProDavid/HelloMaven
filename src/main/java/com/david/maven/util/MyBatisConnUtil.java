package com.david.maven.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis数据库连接工具类
 * @author David
 */
public class MyBatisConnUtil {
	private static final String MYBATIS_CONFIG = "mybatis-config.xml";
//	private static SqlSession session = null;
	private static InputStream is = null;

	/**
	 * 获取数据库连接，返回mybasis session
	 * @return SqlSession
	 */
	public static SqlSession getMybatisConn() {
		is = MyBatisConnUtil.class.getClassLoader().getResourceAsStream(MYBATIS_CONFIG);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();

		if (null != is) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return session;
	}
	
	/**
	 * 关闭session
	 * @param session
	 */
	public static void sessionClose(SqlSession session){
		if(null != session){
			session.close();
		}
	}
}
