//program to demonstrate divide by zero exception
import java.util.Scanner;
class DivideByZeroException extends Exception{
	public DivideByZeroException(String str){
	super(str);
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
	int b=sc.nextInt();
	try{
		if(b==0)
		{
		throw new DivideByZeroException("Divide by zero is not possible...");
		}
		else{
			System.out.println(a/b);
		}
		int c=a/b;
	}
	catch(DivideByZeroException e){
		System.out.println(e.getMessage());
	}
}
}