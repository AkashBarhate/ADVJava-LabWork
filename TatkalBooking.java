package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TatkalBooking
 */
//@WebServlet("/TatkalBooking")
//@SuppressWarnings("serial")
public class TatkalBooking extends HttpServlet {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		/**
	 * 
	 */
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out =response.getWriter();
			
			
			ServletConfig cfg = getServletConfig();
			int startTime= Integer.parseInt(cfg.getInitParameter("startTime"));
			int endTime = Integer.parseInt(cfg.getInitParameter("endTime"));
			
			LocalTime time =LocalTime.now();
			int timeRightNow = time.getHour();
			
			if(timeRightNow >= startTime && timeRightNow <=endTime)
			 out.println("<h1> You are on time, Please Book Tickect asap");
			 else
				 out.println("<h1> You are Late, Come on time next time");
			
		}

}
