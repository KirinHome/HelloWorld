package com.lxk.spring.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;


/**
 * 测试数据库连接池的两种配置方式
 */
public class DataSourceTest {
	@Test
	public void testDataSource() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lxk/spring/jdbc/applicationContext.xml");
		//DataSource dataSource = (DataSource)context.getBean("dataSource");
		DataSource dataSource = (DataSource)context.getBean("dataSource1");
		System.out.println(dataSource);
		
		Connection connection = dataSource.getConnection();
		Statement stmt = connection.createStatement();
		
	}
}
