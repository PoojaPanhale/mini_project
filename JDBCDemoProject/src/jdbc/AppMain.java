package jdbc;

import java.sql.SQLException;

public class AppMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDao d=new EmployeeDao();
		System.out.println(d.viewAll());

	}

}
