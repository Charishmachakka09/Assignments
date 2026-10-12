package dailyassignments;

public class Program_MenuBasedCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
        int b=5;
        
        int choice=3;
        do
        {
        	switch(choice)
        	{
        	case 1:System.out.println("Addition="+(a+b)); break;
        	case 2:System.out.println("Subtraction="+(a-b)); break;
        	case 3:System.out.println("Multiplication="+(a*b));break;
        	case 4:System.out.println("Division="+(a/b)); break;
        	case 5:System.out.println("Successfully exited"); break;
        	}
        	
         choice++;
         break;
        }while(choice<=5) ;
	}

}
