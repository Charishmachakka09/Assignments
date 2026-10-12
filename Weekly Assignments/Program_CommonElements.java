package weeklyassignments;

public class Program_CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1= {10,20,30,40,50};
        int[] arr2= {30,40,60,70,50};
        int[] common=new int[arr1.length];
        int check=0;
        int index=0;
        
        for(int i=0;i<arr1.length;i++)
        {
        	for(int j=0;j<arr2.length;j++)
        	{
        		 if(arr1[i]==arr2[j])
        		 {
        			 for(int k=0;k<common.length;k++)
        			 {
        				 if(common[k]==arr1[i])
        				 {
        					 check=1;
            				 break;
        				 }
        				 
        			 }
        		 
        		 if(check==0)
        		 {
        			 common[index]=arr1[i];
        			 index++;
        		 }
        		 check=0;
        	}
        }
	}   
			for(int i=0;i<common.length;i++)
			{
				if(common[i]!=0)
        	    {
        	    	 System.out.print(common[i]+" ");
        	     }
			}
	}

}
