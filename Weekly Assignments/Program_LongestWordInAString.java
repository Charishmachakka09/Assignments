package weeklyassignments;

public class Program_LongestWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Java Programming is interesting";
        String[] words=str.split(" ");
        String temp="";
        for(int i=0;i<=words.length-1;i++)
        {
        	System.out.println(words[i].length());
        	if(temp.length()>=words[i].length())
        		temp=temp;
        	else
        		temp=words[i];
        		
        }
        System.out.println(temp);
	}

}
