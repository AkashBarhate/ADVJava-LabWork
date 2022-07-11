package com.akash123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


class Loginall{
boolean login=false;
String dbuser;
String dbpass;

public boolean checkLogin(String username,String password, String captcha2){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pleasework","akash1","welcome123");
		java.sql.PreparedStatement  st =con.prepareStatement(" select username, password from customer;");
		ResultSet rs =(ResultSet)st.executeQuery();
		captcha cp=new captcha();
		//String cp1=cp.captcha1;
	     System.out.println("Orignal captcha "+cp.captcha1);
	     System.out.println("Text wala captcha "+captcha2);
		while(rs.next()){
		dbuser=rs.getString("username");
		dbpass=rs.getString("password");
//	   System.out.println(dbuser);
//	   System.out.println(dbpass);
//	   System.out.println(username);
//	   System.out.println(password);
	   if(dbuser.equals(username) && dbpass.equals(password) && cp.captcha1.equals(captcha2) ) {
			 login=true;
		
		 }
		
		}
}catch(Exception e) {
	e.printStackTrace();
}
  return login;
}
}
