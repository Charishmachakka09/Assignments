package dailyassignments;
class Employee
{
	int employeeId;
	String employeeName;
	double salary;
	Employee(int employeeId,String employeeName,double salary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	void displayDetails()
	{
		
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Salary:"+salary);
		System.out.println();
	}
}
public class Program_EmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1=new Employee(101,"Rahul",100000);
      e1.displayDetails();
      Employee e2=new Employee(102,"Raju",100000);
      e2.displayDetails();
	}

}
