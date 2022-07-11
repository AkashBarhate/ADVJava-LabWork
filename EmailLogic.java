package com.akash123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EmailLogic {
	boolean registration=true;
	String dbmail;
	public boolean emailCheck(String email){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pleasework","akash1","welcome123");
			java.sql.PreparedStatement  st =con.prepareStatement(" select email from customer;");
			ResultSet rs =(ResultSet)st.executeQuery();
			while(rs.next()){
			dbmail=rs.getString("email");
			 if(dbmail.equals(email)) {
				 registration=false;
			 }
			
			}
	}catch(Exception e) {
		e.printStackTrace();
	}
	  return registration;
	}
}
