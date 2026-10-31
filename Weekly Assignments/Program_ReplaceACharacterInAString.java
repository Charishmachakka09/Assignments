package weeklyassignments;

public class Program_ReplaceACharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="banana";
         String str1="";
         for(int i=0;i<str.length();i++)
         {
        	 char c=str.charAt(i);
        	 if(c=='a')
        		 str1=str1+"o";
        	 else
        		 str1=str1+(c+"");
         }
         System.out.println(str1);
	}

}
