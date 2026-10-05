package dailyassignments;

public class Program_SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1124;
		int originalNum=num;
        int sum=0;
        int product=1;
        
        	for(;num>0;)
        	{
        		int lastDigit=num%10;
        		sum+=lastDigit;
        		product*=lastDigit;
        		num=num/10;
        	}
        	
        System.out.println("Number is:"+originalNum);
        System.out.println("Sum of digits="+sum);
        System.out.println("Product of digits="+product);
        if(sum==product)
              System.out.println(originalNum +" is a Spy Number");
        else
        	System.out.println(originalNum +" is not a Spy Number");
	}

}
