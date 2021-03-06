package com.hrd.common.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionVO {
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final String USER_NAME = "system";
	private final String PASSWORD = "1234";
	private Connection conn;

	public ConnectionVO() throws Exception {
		Class.forName(DRIVER_NAME);
		System.out.println("Driver Uploading success");
	}

	public Connection getConnection() {
		System.out.print("create Connection ");
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Success");
		} catch (SQLException e) {
			System.out.println("Fail");
			return null;
		}
		return conn;
	}

	public void close(Object... objArr) {

		try {
			for (Object obj : objArr) {
				if (obj instanceof ResultSet) {
					((ResultSet) obj).close();
				} else if (obj instanceof PreparedStatement) {
					((PreparedStatement) obj).close();
				} else if (obj instanceof Connection) {
					((Connection) obj).close();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
