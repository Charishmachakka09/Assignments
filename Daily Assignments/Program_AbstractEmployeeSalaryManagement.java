package dailyassignments;
abstract class Employee9
{
	int employeeId;
	String employeeName;
	abstract void calculateSalary();
	Employee9(int employeeId,String employeeName)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	void displayDetails()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
	}
}
class FullTimeEmployee extends Employee9
{
	FullTimeEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}
	int monthlySalary;
	void calculateSalary()
	{
		this.monthlySalary=50000;
	}
	void displayDetails()
	{
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Monthly Salary:"+monthlySalary);
		System.out.println("");
	}
}
class PartTimeEmployee extends Employee9
{
	PartTimeEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyRate) {
		super(employeeId, employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	int hoursWorked;
	int hourlyRate;
	int salary;
	void calculateSalary()
	{
		salary=hoursWorked*hourlyRate;
	}
	void displayDetails()
	{
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Hours Worked:"+hoursWorked);
		System.out.println("Hourly Rate:"+hourlyRate);
		System.out.println("Monthly Salary:"+salary);
	}
}
public class Program_AbstractEmployeeSalaryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FullTimeEmployee full=new FullTimeEmployee(101,"Rahul");
        full.calculateSalary();
        full.displayDetails();
        PartTimeEmployee part=new PartTimeEmployee(102,"Amit",80,300);
        part.calculateSalary();
        part.displayDetails();
	}

}
