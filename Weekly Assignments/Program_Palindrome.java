package weeklyassignments;

public class Program_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=101;
		int num1=num;
        int revNum=0;
        
        for(;num>0;)
        {
        	int val=num%10;
        	revNum=revNum*10+val;
        	num=num/10;
        }
        System.out.println(revNum);
        if(revNum==num1)
        	System.out.println(num1+" is the palindrome number");
        else
        	System.out.println(num1+" is not the palindrome number");
	}

}
