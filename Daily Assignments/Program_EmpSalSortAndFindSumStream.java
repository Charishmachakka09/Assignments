package dailyassignments;

import java.util.*;

class Employee7
{
	String name;
	double salary;
	public Employee7(String name, double salary) {
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
public class Program_EmpSalSortAndFindSumStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee7>list=new ArrayList<Employee7>();
		Employee7 e1=new Employee7("Rahul",50000);
		Employee7 e2=new Employee7("Priya",70000);
		Employee7 e3=new Employee7("Amit",60000);
		list.add(e1);list.add(e2);list.add(e3);
		
		System.out.println("Sort Employees by Salary in Ascending Order");
		list.stream().sorted(Comparator.comparing(Employee7::getSalary))
		.forEach(e->System.out.println(e.name+":"+e.salary));
		
		System.out.println("\nSort Employees by Salary in Descending Order");
		list.stream().sorted(Comparator.comparing(Employee7::getSalary).reversed())
		.forEach(e->System.out.println(e.name+":"+e.salary));
		
		double sum=list.stream().map(Employee7::getSalary)
				.mapToDouble(Double::doubleValue).sum();
        System.out.println("\nThe total salary of all employees:"+sum);

	}

}
