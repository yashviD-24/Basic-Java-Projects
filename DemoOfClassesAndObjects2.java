// Java program to demonstrate class and objects
// Create a class Student with attributes enrollmentNo and name. Create three objects of the class Student and print their details.
public class DemoOfClassesAndObjects2 
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		System.out.println();
		s1.enrollmentNo=226230307000L;
		s1.name="abc";
		
		Student s2=new Student();
		s2.enrollmentNo=226230307500L;
		s2.name="pqr";
		
		Student s3=new Student();
		s3.enrollmentNo=226230307700L;
		s3.name="xyz";
		
		System.out.println("Enrollement No. | Name");
		System.out.println(s1.enrollmentNo + "    | " + s1.name);
		System.out.println(s2.enrollmentNo + "    | " + s2.name);
		System.out.println(s3.enrollmentNo + "    | " + s3.name);
	}
}
class Student
{
	long enrollmentNo;
	String name;
}