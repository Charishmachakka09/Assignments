package weeklyassignments;

public class Program_CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=67;
        int count=0;
        
        if(num==0)
        	count++;
        else
        {
        	while(num>0)
        	{
        		int val=num%10;
        		count++;
        		num=num/10;
        	}
        }
        System.out.println(count);
	}

}
