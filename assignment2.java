package com.akash123;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/assignment2")
public class assignment2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int num1=Integer.parseInt(request.getParameter("num1")); 
	    int num2=Integer.parseInt(request.getParameter("num2"));
	    
		//response.setContentType("text/html");
	       PrintWriter out= response.getWriter();
	       
	       if(request.getParameter("add")!=null) {
	    	   int sum = num1+num2;
	    	   out.write("<html><body>");
				out.write("<h1>"+sum+"</h1>");
				out.write("</body></html>");
	       }
	       if(request.getParameter("sub")!=null) {
	    	   int sub=num1-num2;
	    	   out.write("<html><body>");
				out.write("<h1>"+sub+"</h1>");
				out.write("</body></html>");
	       }
		
	}

	

}
