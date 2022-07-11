package com.akash123;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/captcha.jpg")
public  class captcha extends HttpServlet {
	
	
	public String captcha1="";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("image/jpeg");
	ServletOutputStream out= response.getOutputStream();
	
	//Logic for generating captcha text
	String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	//String captcha1 ="";
	captcha1="";
	for(int i=0;i<5;i++) {
		int rno=(int)(Math.random()* str.length());
		captcha1 += str.charAt(rno);
	  	
	}
	System.out.println(captcha1);
	//now code for sending captcha in form of image
	BufferedImage img= new BufferedImage(120,45, BufferedImage.TYPE_INT_RGB);
	Graphics g=img.getGraphics();
	
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, 100, 45);
	g.setColor(Color.RED);
	g.setFont(new Font("Harrington", Font.BOLD,28));
	g.drawString(captcha1, 25, 30);
	
	ImageIO.write(img, "jpeg", out);
	
	
	}
	
	}
	


