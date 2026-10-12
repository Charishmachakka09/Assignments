package dailyassignments;

public class Program_CountOfEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {11,24,35,42,56,67,80,93};
       int evenCount=0;
       int oddCount=0;
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i]%2==0)
    		   evenCount++;
    	   else
    		   oddCount++;
    		   
       }
       System.out.println("Even Numbers:"+ evenCount);
       System.out.println("Odd Numbers:"+ oddCount);
	}

}
