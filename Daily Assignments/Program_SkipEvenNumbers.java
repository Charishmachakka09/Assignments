package dailyassignments;

public class Program_SkipEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
        do
        {
        	if(num%2!=0)
        		System.out.println(num);
        	num++;
        }while(num<=15);
	}

}
