package weeklyassignments;

public class Program_SeperatePosAndNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {-4,7,0,-2,9,0,-8,5};
        int[] arr1=new int[arr.length];
        int index=0;
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>0)
        	{
        		arr1[index]=arr[i];
        	    index++;
        	}
        }
      
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]<0)
        	{
        		arr1[index]=arr[i];
        	    index++;
        	}
        }
        		
        
        for(int i=0;i<arr1.length;i++)
        {
        	System.out.print(arr1[i]+" ");
        }
	}

}
