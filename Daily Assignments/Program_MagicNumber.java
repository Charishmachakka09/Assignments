package dailyassignments;

public class Program_MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=172;
		int originalNum=num;
        int sum=0;
        int finalSum=0;
        	for(;num>0;)
            {
            	int lastDigit=num%10;
            	sum+=lastDigit;
            	num=num/10;
            }
        System.out.println("Number is:"+originalNum);
        System.out.println("Sum of digits:"+sum);
        if (sum>9)
        {
        	num=sum;
        	for(;num>0;)
            {
            	int lastDigit=num%10;
            	finalSum+=lastDigit;
            	num=num/10;
            }
        	System.out.println("Final Digit is:"+finalSum);
        }
        
        if(finalSum==1)
        	System.out.println(originalNum+" is a Magic Number");
        else
        	System.out.println(originalNum+" is not a Magic Number");
	}

}
