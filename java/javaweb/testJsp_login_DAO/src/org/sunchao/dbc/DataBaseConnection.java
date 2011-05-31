package org.sunchao.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * 用于数据库的连接与关闭
 *
 */
public class DataBaseConnection {
	private final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	private final String DBURL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String DBUSER = "scott";
	private final String DBPASSWORD = "tiger";
	Connection conn = null;
	
	public DataBaseConnection() {
		try {
			Class.forName(DBDRIVER);//加载驱动
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);//得到连接
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public void close() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
