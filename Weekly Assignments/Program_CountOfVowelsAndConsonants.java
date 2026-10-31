package weeklyassignments;

public class Program_CountOfVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Programming";
         str=str.toLowerCase();
         int vowels=0;
         int consonants=0;
         for(int i=0;i<str.length();i++)
         {
        	 char c=str.charAt(i);
        	 if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
        		 vowels++;
        	 else
        		 consonants++;
         }
         System.out.println("Vowels:"+vowels);
         System.out.println("Consonants:"+consonants);
	}

}
