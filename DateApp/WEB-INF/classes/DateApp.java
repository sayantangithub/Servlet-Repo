package com.trianz.servlet;
import jakarta.servlet.*;
import java.io.*;
import java.util.*;

public class DateApp extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{

		PrintWriter pw = res.getWriter();

		res.setContentType("txt/html");

		Date dt=new Date();

		pw.println("<h1 style=color:red;text-align:center>Date and time is::"+dt+"</h1>");

		pw.close();
	}
}