//MAXIMUM OF THREE NUMBERS...
//USING TERNARY OPERATOR
import java.util.Scanner;
public class MaxOfThree{
	public static void main(String[] args){
		int a,b,c,max;
		try (Scanner input = new Scanner(System.in)) {
		
			System.out.println("Enter any three numbers:");
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
		
			max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
			System.out.println("Maximum among three nos: " + max);
		}
	}
}