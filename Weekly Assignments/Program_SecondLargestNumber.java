package weeklyassignments;

public class Program_SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12, 45, 7, 89, 34, 89, 56};
		int[] arr1=new int[arr.length];
		int index=0;
		int check=0;
		for(int i=0;i<arr.length;i++)
    	{
    	    for(int j=i+1;j<arr.length;j++)
    	    {
    	    	if(arr[i]<arr[j])
    	    	{
    	    	   int temp=arr[i];
    	    	   arr[i]=arr[j];
    	    	   arr[j]=temp;
    	    	}
    	    		
    		}
    		
    	}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					check=1;
					break;
				}
			}
			if(check==0)
			{
				arr1[index]=arr[i];
				index++;
			}
			check=0;
		}
		
			System.out.print("Second Largest Element:"+arr1[1]);
		
	}

}
