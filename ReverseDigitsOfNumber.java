//REVERSE THE DIGITS OF A NUMBER USING WHILE LOOP...
import java.util.Scanner;
public class ReverseDigitsOfNumber{
	public static void main(String[] args){
		int no, reve=0, remind;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			no = input.nextInt();
			
			while(no != 0){
				remind = no % 10;
				reve = reve * 10 + remind;
				no = no / 10;
			}
			System.out.println("The Reversed No.: " + reve);
		}
	}
}