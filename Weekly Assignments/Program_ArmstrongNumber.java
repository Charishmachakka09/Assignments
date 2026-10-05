package weeklyassignments;

public class Program_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=num1;
		int num3=num1;
        int count=0;
        int result=0;
        
        if(num2==0)
        	count++;
        else
        {
        	while(num2>0)
        	{
        		int val=num2%10;
        		count++;
        		num2=num2/10;
        	}
        }
        
        while(num3>0)
    	{
    		int val=num3%10;
    		result+=Math.powExact(val,count);
    		num3=num3/10;
    	}
        
        if (result==num1)
              System.out.println(num1+" is the armstrong number");
        else
              System.out.println(num1+" is not the armstrong number");
	}

}
