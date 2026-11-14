package weeklyassignments;

import java.util.*;

public class Program_StudentMarksCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		      Scanner sc=new Scanner(System.in);
              int[] arr=new int[5];
              int sum=0;
              System.out.println("Enter marks of 5 subjects:");
              for(int i=0;i<=arr.length;i++)
              {
        	      int num=sc.nextInt();
        	      arr[i]=num;
        	      sum+=num;
               }
    	      System.out.println("Total Marks:"+sum);
              float average=sum/arr.length;
              System.out.println("Average Marks:"+average);
            }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println("Array Index Out of Bounds Exception");
       }
       catch(Exception e)
       {
    	   System.out.println("Invalid input! Please enter integer marks");
       }
       
       finally
       {
    	   System.out.println("Marks calculation process completed");
       }
      
	}

}
