package weeklyassignments;

public class Program_ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=1234;
        int revNum=0;
        
        for(;num>0;)
        {
        	int val=num%10;
        	revNum=revNum*10+val;
        	num=num/10;
        }
        System.out.println(revNum);
	}

}
