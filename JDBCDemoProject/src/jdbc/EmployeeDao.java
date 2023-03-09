package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public List<Employee>  viewAll() throws ClassNotFoundException, SQLException
	{
		  ArrayList<Employee> list=new  ArrayList<Employee>();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/program1","root","Pooja@123");
	        PreparedStatement statement=con.prepareStatement("select * from empdemo");
	        ResultSet rs=statement.executeQuery();
	        while(rs.next())
	        {
	        	Employee e=new Employee();
	        	e.setId(rs.getInt(1));
	        	e.setEname(rs.getString(2));
	        	e.setSalary(rs.getFloat(3));
	        	e.setAge(rs.getInt(4));
	        	list.add(e);
	        	  }
     con.close();
     return list;
		
	}


}
