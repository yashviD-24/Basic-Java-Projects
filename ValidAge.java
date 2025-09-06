// Java program to demonstrate user-defined exception
// to check if a person is eligible to vote or not.
// If person is under 18, an exception is thrown.
import java.util.Scanner;
class ValidAge extends Exception{
public ValidAge(String str){
		super(str);
}
public static void main(String args[]){
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter age:");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new ValidAge("Citizens under 18 are not eligible to vote...");
			} else {
				System.out.println("Eligible to vote...");
			}
		} catch (ValidAge e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of cade....");
	}
}
}