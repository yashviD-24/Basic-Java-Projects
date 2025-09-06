// Java program to calculate area of circle
// using class and object
public class AreaOfCircle {
	final float pi=3.14f;
	public float CircleArea(float r){
		return pi*r*r;
	}
	public static void main(String[] args){
		AreaOfCircle c=new AreaOfCircle();
		float r=6.5f;
		float area=c.CircleArea(r);
		
		System.out.println("Area of "+r+":"+area);
	}
}