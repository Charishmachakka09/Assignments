package dailyassignments;

class Student
{
	int rollNumber;
	String name;
	static String collegeName="ABC Engineering College";
	static int studentCount=0;
	
	Student(int rollNumber,String name)
	{
		studentCount++;
		this.rollNumber=rollNumber;
		this.name=name;
	}
	static void changeCollegeName(String collegeName1)
	{
		collegeName=collegeName1;
		System.out.println("College name updated successfully");
	}
	void displayDetails()
	{
		System.out.println("Roll Numebr:"+rollNumber);
		System.out.println("Name:"+name);
		System.out.println("College:"+collegeName);
	}
	static void displayStudentCount()
	{
		System.out.println("Total Students:"+ studentCount);
	}
}
public class Program_StudentManagementSystem {
    static
    {
    	System.out.println("The Student class is initialised");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s1=new Student(101,"Rahul");
         s1.displayDetails();
         Student s2=new Student(102,"Priya");
         s2.displayDetails();
         Student s3=new Student(103,"Amit");
         s3.displayDetails();
         Student.displayStudentCount();
         Student.changeCollegeName("XYZ Institute of Technology");
         s1.displayDetails();
         s2.displayDetails();
         s3.displayDetails();
         Student.displayStudentCount();
	}

}