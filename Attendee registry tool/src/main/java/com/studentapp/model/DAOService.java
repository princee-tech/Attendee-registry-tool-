package com.studentapp.model;

import java.sql.ResultSet;

public interface DAOService {
	
	public void connectionDB();
	public boolean verifyCredential(String email,String password);
	public void saveReg(String name, String city, String email, String mobile);
	public ResultSet listRegistration();
	public void deleteByEmail(String email);
	
	
}
