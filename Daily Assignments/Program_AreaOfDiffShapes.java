package dailyassignments;

public class Program_AreaOfDiffShapes {
    
	
	static void calculateArea(int radius)
	{
		System.out.println("Radius of circle:"+radius);
		System.out.println("Area of Circle:"+3.14*radius*radius);
	}
	static void calculateArea(int length,int breadth)
	{
		System.out.println("Length of rectangle:"+length);
		System.out.println("Breadth of rectangle:"+breadth);
		System.out.println("Area of Rectangle:"+length*breadth);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateArea(5);
		calculateArea(8,4);

	}

}
