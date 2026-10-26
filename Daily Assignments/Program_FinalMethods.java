package dailyassignments;
class Employee1
{
	final void calculateBonus()
	{
		System.out.println("Parent class");
	}
}
class Manager extends Employee1
{
	void calculateBonus()
	{
		System.out.println("Subclass");
	}
}
public class Program_FinalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	}

}
