// Java program to demonstrate class and objects
public class DemoOfClassAndObjects 
{
     String name="YASHVI A. DUNGRANI";
     int enrollmentno=7041;


    public static void main(String[] args) 
    {
        DemoOfClassAndObjects S1 = new DemoOfClassAndObjects();
        DemoOfClassAndObjects S2 = new DemoOfClassAndObjects();
        DemoOfClassAndObjects S3 = new DemoOfClassAndObjects();

        System.out.println(S1.name);
        System.out.println(S1.enrollmentno);
        System.out.println(S2.name);
        System.out.println(S2.enrollmentno);
        System.out.println(S3.name);
        System.out.println(S3.enrollmentno);
    }
	}