package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.deo.IPLDeo;
import com.deo.impl.IPLDeoImpl;
import com.entity.IPL;

public class iplService {
	
public List<IPL> ViewAll() throws ClassNotFoundException, SQLException 
{
	List<IPL>list=new IPLDeoImpl().findAll();
	for(IPL i:list)
	{
		System.out.println(i);
	}
	return list;
			
}
public void insertIPL() throws ClassNotFoundException, SQLException
{
	IPL i=new IPL();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int teamid=sc.nextInt();
	System.out.println("enter the tname");
	String  tname=sc.next();
	System.out.println("enter the city");
	String city=sc.next();
	System.out.println("enter the state");
	String state=sc.next();
	i.setTeamid(teamid);
	i.setTname(tname);
	i.setCity(city);
	i.setState(state);
	new IPLDeoImpl().insertIPL(i);
}
public void updateIPL() throws ClassNotFoundException, SQLException
{
IPL i=new IPL();
Scanner sc=new Scanner(System.in);

System.out.println("enter the tname");
String  tname=sc.next();
System.out.println("enter the city");
String city=sc.next();
System.out.println("enter the state");
String state=sc.next();
System.out.println("enter the id");
int teamid=sc.nextInt();
i.setTeamid(teamid);
i.setTname(tname);
i.setCity(city);
i.setState(state);
new IPLDeoImpl().updateIPL(i);
}
public void deleteIPL() throws ClassNotFoundException, SQLException
{
IPL i=new IPL();
Scanner sc=new Scanner(System.in);

System.out.println("enter the id");
int teamid=sc.nextInt();//
i.setTeamid(teamid);

new IPLDeoImpl().deleteIPL(i);
}

}
