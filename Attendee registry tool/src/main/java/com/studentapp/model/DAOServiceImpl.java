package com.studentapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl  implements DAOService{

	private Connection con;
	private Statement stmnt;

	@Override
	public void connectionDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregestrationapp","root","test");
			stmnt=con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifyCredential(String email, String password) {
		// TODO Auto-generated method stub 
	try {
		ResultSet  result=stmnt.executeQuery("select* from login where email='"+email+"'and password ='"+password+"'");
	return result.next();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return false;
	}

	@Override
	public void saveReg(String name, String city, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into regestration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet listRegistration() {
		// TODO Auto-generated method stub
		try {
			ResultSet  result=stmnt.executeQuery("select* from regestration ");
		return result;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteByEmail(String email) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("Delete from regestration where email='"+email+"'");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}