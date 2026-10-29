package dailyassignments;

public class Program_CharacterWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char alpha='7';
        char alpha1='A';
        char alpha2='b';
        
        if(Character.isDigit(alpha))
        	System.out.println(alpha +" is a digit");
        else
        	System.out.println(alpha +" is not a digit");
        
        if(Character.isLetter(alpha1))
        	System.out.println(alpha1 +" is a letter");
        else
        	System.out.println(alpha1 +" is not a letter");
        
        System.out.println("Uppercase of "+ alpha2+" is "+ Character.toUpperCase(alpha2));
	}

}
