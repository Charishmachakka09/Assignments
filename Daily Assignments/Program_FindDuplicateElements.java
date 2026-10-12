package dailyassignments;

public class Program_FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20, 30, 20, 40, 10, 50, 30, 60};
        int duplicate[]=new int[arr.length];
        int index=0;
        int check=0;
        System.out.print("Duplicate Elements:");
        for (int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			for(int k=0;k<duplicate.length;k++)
        			{
        				if(duplicate[k]==arr[i])
        				{
        					check=1;
        					break;
        				}
        			}
        		 if(check==0)
        		 {
        			 duplicate[index]=arr[i];
        			 
        			 index++;
        		 }
        		 check=0;
        		}
        	}
        }
             for(int i=0;i<duplicate.length;i++)
             {   
        	     if(duplicate[i]!=0)
        	    {
        	    	 System.out.print(duplicate[i]+" ");
        	     }
        	    	 
        	 }
        
        
	}

}
