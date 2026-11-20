package weeklyassignments;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee8
{
	private String name;
	private String department;
	private int salary;
	public Employee8(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public String getName() 
	{ 
		return name; 
	} 
	public String getDepartment() 
	{ 
		return department; 
	} 
	public int getSalary() 
	{ 
		return salary; 
	} 
	@Override 
	public String toString() 
	{ 
		return name + " - " + department + " - " + salary; 
	}
	
}
public class Program_JavaStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee8> employees = Arrays.asList( 
				new Employee8("Rahul", "IT", 60000), 
				new Employee8("Priya", "HR", 45000), 
				new Employee8("Amit", "IT", 75000), 
				new Employee8("Neha", "Finance", 55000), 
				new Employee8("Karan", "IT", 60000), 
				new Employee8("Simran", "HR", 50000), 
				new Employee8("Rohit", "Finance", 75000),
                new Employee8("Ankit", "IT", 40000) );
		
		System.out.println("Employess whose salary is greater than 50000");
		employees.stream()
		.filter(s->s.getSalary()>50000)
		.forEach(s->System.out.println(s.getName()));
		
		System.out.println("Employees who all are working in the IT department");
		employees.stream()
		.filter(s->s.getDepartment().equals("IT"))
		.map(Employee8::getName)
		.forEach(s->System.out.println(s));
		
		System.out.println("Sorting All Employees in Ascending Order");
		employees.stream()
		.sorted(Comparator.comparingInt(Employee8::getSalary))
		.forEach(s->System.out.println(s.getName()+"-"+s.getSalary()));
		
		System.out.println("Distinct Salaries in ascending order");
		employees.stream()
				.map(Employee8::getSalary)
				.distinct().sorted()
				.forEach(s->System.out.println(s));
		
		System.out.println("Distinct Department Names in which employees has salary greater than or equal to 50000");
		employees.stream()
		.filter(s->s.getSalary()>=50000)
		.map(Employee8::getDepartment)
		.distinct().sorted()
		.forEach(s->System.out.println(s));

	}

}
