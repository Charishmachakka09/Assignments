package dailyassignments;
import java.util.*;
class Student4
{
	int rollNo;
	String name;
	String course;
	Student4(int rollNo,String name,String course)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	@Override
	public int hashCode() {
		return Objects.hash(course, name, Integer.valueOf(rollNo));
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student4 other = (Student4) obj;
		return Objects.equals(course, other.course) && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
}
public class Program_StudentMgmtSysSetDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Student4> set=new LinkedHashSet<Student4>();
        Student4 obj1=new Student4(101,"Rahul","Java");
        Student4 obj2=new Student4(102,"Priya","Python");
        Student4 obj3=new Student4(101,"Rahul","Java");
        Student4 obj4=new Student4(103,"Amit","Java");
        Student4 obj5=new Student4(102,"Priya","Java");
        Student4 obj6=new Student4(101,"Rahul","Selenium");
        set.add(obj1);
        set.add(obj2);
        set.add(obj3);
        set.add(obj4);
        set.add(obj5);
        set.add(obj6);
        for(Student4 obj:set)
        {
        	System.out.println("Student{rollNo="+obj.rollNo+",name='"+obj.name+"',course='"+obj.course+"'}");
        }
        System.out.println("\nTotal Students:"+set.size());
	}

}
