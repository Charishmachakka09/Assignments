package day16;
import java.util.*;
public class Program_ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=1;i<=5;i++)
        { 
        	 System.out.println("Enter element "+i);
             int e1=sc.nextInt();
             arr[i-1]=e1;
             sum+=e1;
        }
        System.out.println("Sum:"+sum);
       
	}

}
