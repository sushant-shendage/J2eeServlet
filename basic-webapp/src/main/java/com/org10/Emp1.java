package com.org10;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empform")
public class Emp1 extends HttpServlet {
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		try 
		{
			//driver loading database driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Postgresql database driver is loaded ..!");
			
			//creating connection
		 
				Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp2?user=postgres&password=root");
				System.out.println("connection with database is created ..!");
				
				
		 
				String id=req.getParameter("eid");
				int id1=Integer.parseInt(id);
				
				String name=req.getParameter("ename");
				
				//creating statement
				
				PreparedStatement ps=con.prepareStatement("insert into emp values(?,?)");
				
				PreparedStatement ps2=con.prepareStatement("select * from emp");
				ResultSet rs1=ps2.getResultSet();
				
				ps.setInt(1,id1);
				ps.setString(2,name);
				ps.execute();
				ps2.execute();				
				
				RequestDispatcher rd=req.getRequestDispatcher("Employee1.html");
				PrintWriter pw=resp.getWriter();
				
				pw.print("<pre>Data inserted successfully..!</pre>");
				 rd.include(req, resp);
				
		} catch (NumberFormatException nfe) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("Employee1.html");
			PrintWriter pw=resp.getWriter();
			
			pw.print("<pre> Please enter valid data..!</pre>");
			
			rd.include(req, resp);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
		
		
		

		
 
		
		 
	}
}
