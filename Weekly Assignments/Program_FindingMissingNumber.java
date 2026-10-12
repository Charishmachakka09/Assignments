package weeklyassignments;

public class Program_FindingMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {10,9,8,3,6,5,4,2,1};
        int num=1;
        	for(int i=0;i<arr.length;i++)
        	{
        	    for(int j=i+1;j<arr.length;j++)
        	    {
        	    	if(arr[i]>arr[j])
        	    	{
        	    	   int temp=arr[i];
        	    	   arr[i]=arr[j];
        	    	   arr[j]=temp;
        	    	}
        	    		
        		}
        		
        	}
          	for(int i=0;i<arr.length;i++)
          	{
          		if(arr[i]==num)
          		{
          			num++;
          			continue;
          		}
          		else
          		{
          			System.out.print("Missing Number:"+ num);
          			break;
          		}
          	}
    }

}
