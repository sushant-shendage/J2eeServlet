package com.org3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sdetails")
public class FetchingDataFromHtmlDoc extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
//		pw.print("<pre>this is Http servlet</pre>");
		
		 String name=req.getParameter("sname");
		 String rollNo=req.getParameter("srollno");
		
	
		pw.print("<pre>Name : "+name+" roll no : "+rollNo+"</pre>");

	}
}
