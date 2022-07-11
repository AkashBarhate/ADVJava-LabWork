package com.akash123;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/signin")
public class SignIn extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name=request.getParameter("name");
		String email=request.getParameter("email");
		int mobileNo = Integer.parseInt(request.getParameter("mobileNo"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String encodedText = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
		PrintWriter out = response.getWriter();
		EmailLogic el=new EmailLogic();
		boolean res=el.emailCheck(email);
		
		if(res) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pleasework","akash1","welcome123");
				java.sql.PreparedStatement  st =con.prepareStatement("insert into customer(name,email,mobileno,username,password)values(?,?,?,?,? )");
		        st.setString(1, Name);
		        st.setString(2, email);
		        st.setInt(3, mobileNo);
		        st.setString(4, username);
		        //st.setString(5,password);
		        st.setString(5,encodedText);

		        st.executeUpdate();
		        con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		out.write("<html><body>");
		out.write("<h1>Registration successful!</h1>");
		out.write("</body></html>");
	
		}
		else {
			out.write("<html><body>");
			out.write("<h1>Mail Id already Registerd</h1>");
			out.write("</body></html>");
			
		}
	}

}
