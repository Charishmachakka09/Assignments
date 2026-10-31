package weeklyassignments;

public class Program_AllPossibleSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="ABC";
        for(int i=0;i<str.length();i++)
        {
        	System.out.println(str.charAt(i));
        	for(int j=i+1;j<str.length();j++)
        	{
        		System.out.println(str.substring(i,j+1));
        	}
        }
	}

}
