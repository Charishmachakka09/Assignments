package weeklyassignments;

public class Program_SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int res=0;
        for(int i=0;i<=50;i++)
        {
        	if(i%2==0)
        	     res+=i;
        }
        System.out.println("Sum of even numbers: "+res);
	}

}
