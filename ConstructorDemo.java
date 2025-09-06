// Java program to demonstrate constructor
// A class Rectangle is created to calculate area of rectangle
// when height and width are provided as parameters to constructor.
class Rectangle
{
	int height;
	int width;
	int area;
	
	Rectangle(int height,int width)
	{
		this.height=height;
		this.width=width;
		area=this.height * this.width;
		System.out.println("Area of rectangle: "+ area);
	}
}
public class ConstructorDemo
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(5,10);
		System.out.println("Accessed area from r1: " + r1.area);
	}
}