package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("pooja", "satara", 24000);
		Employee e2=new Employee("acb", "wai", 29000);
		Employee e3=new Employee("anita", "phaltan", 28000);
		ArrayList<Employee>list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
      
        System.out.println("=================");
        for(Employee e:list)
        {
      	  System.out.println(e);
        }
        System.out.println("=================sorting");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice");
        int choice=sc.nextInt();
        if(choice==1)
        {
        NameSort n=new NameSort();
        Collections.sort(list,n);
        
        for(Employee e:list)
        {
      	  System.out.println(e);
        }
        }
        else
        {
      	  SalarySort s=new SalarySort();
            Collections.sort(list,s);
            
            for(Employee e:list)
            {
          	  System.out.println(e);
            }
        }
  	}
  	
       
}
