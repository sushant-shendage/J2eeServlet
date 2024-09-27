package com.org9;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/snameandid")
public class Student extends HttpServlet   
{
	static
	{
		try 
		{
			//driver loading database driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Postgresql database driver is loaded ..!");
			
			//creating connection
			try 
			{
				Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp2?user=postgres&password=root");
				System.out.println("connection with database is created ..!");
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String id=req.getParameter("sid");
		String name=req.getParameter("sname");
		
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>"+id+"</h1>");
		
 
		
		 
	}

}
