package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.UserBean;

public class UserDao {

	public void addUser(UserBean userBean) {// fn ln em pw
		// db
		// insert g c
		// ?

		String url = "";
		String userName = "";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement pstmt = con.prepareStatement("");
			pstmt.executeUpdate();
		} catch (Exception e) {

		}
	}

	public ResultSet getAllUsers() {
		String url = "";
		String userName = "";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement pstmt = con.prepareStatement("select * from users");
			ResultSet rs = pstmt.executeQuery();
			return rs;// records
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;// error
	}

}

//200 user -> 200 thread -> addUser()  
//1 addUser
//199..wait 
