package com.aia.member;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class MemberRestApplicationTests {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testConnection() throws SQLException {
		System.out.println(dataSource);
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		conn.close();
	}
	
	@Test
	public void testSqlSessionFactory() {
		System.out.println("check SessionFactory : " + sessionFactory);
	}
	
	@Test
	public void testSqlSessionTemplate() {
		System.out.println("check SessionTemplate : " + sessionTemplate);
		
	}

}
