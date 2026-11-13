package dailyassignments;

import java.util.*;

public class Program_RemoveDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(30);
        Set<Integer>set=new LinkedHashSet<Integer>();
        set.addAll(list);
        System.out.println("Unique Elements:"+set);
        System.out.println("Total Unique Elements:"+set.size());
	}

}
