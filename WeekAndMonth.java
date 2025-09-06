// Java program to demonstrate ArrayList and LinkedList
// storing and displaying days of the week and months of the year.
// ArrayList is used for weekdays and LinkedList for months.
import java.util.ArrayList;
import java.util.LinkedList;
public class WeekAndMonth{
	public static void main(String args[]){
		ArrayList<String> weekdays=new ArrayList<>();
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");
		LinkedList<String> months=new LinkedList<>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		System.out.println("Weekdays: ");
		for(String w:weekdays){
			System.out.println(w);
		}
		for(String m:months){
			System.out.println(m);
		}
	}	
}