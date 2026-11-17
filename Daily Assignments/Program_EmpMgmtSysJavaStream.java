package dailyassignments;

import java.util.*;
import java.util.stream.Collectors;

class Employee6
{
	String name;
	double salary;
	public Employee6(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
public class Program_EmpMgmtSysJavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee6 e1=new Employee6("Amit",45000);
       Employee6 e2=new Employee6("Rahul",65000);
       Employee6 e3=new Employee6("Anjali",75000);
       Employee6 e4=new Employee6("Priya",40000);
       List<Employee6>list=new ArrayList<Employee6>();
       list.add(e1);list.add(e2);list.add(e3);list.add(e4);
       
       List<Employee6>filterEmployee=
    		   list.stream().filter(e->e.getSalary()>50000)
    		   .collect(Collectors.toList());
       System.out.println("Employee earning more than 50000:\n");
       filterEmployee.stream().forEach(e->System.out.println(e.getName()+"-"+e.getSalary()));
	}

}
