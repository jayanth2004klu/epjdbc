package com.klef.jdbc;

/**
 * Hello world!
 */
import java.sql.*;
public class App {
    public static void main(String[] args) throws SQLException  {
    	String url="jdbc:mysql://localhost:3306/kluniversity";
    	String username="root";
    	String password="Kishore2005+";
    	Connection con=DriverManager.getConnection(url, username, password);
    	Statement st=con.createStatement();
    	ResultSet rs=st.executeQuery("select * from student");
    	while(rs.next())
    	{
    		System.out.println("Id :"+rs.getInt(1)+" "+"Name :"+rs.getString(2));
    		
    	}
    }
}
