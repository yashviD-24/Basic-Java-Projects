import java.util.Scanner;
import java.util.ArrayList;

public class LibraryManagement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("WELCOME TO GOVERNMENT POLYTECHNIC GANDHINAGAR LIBRARY");
        System.out.println("_____________");
        System.out.println("*************");
        
        System.out.print("ENTER YOUR ENROLLMENT NO: ");
        int enr_no = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("ENTER YOUR DEPARTMENT NAME: ");
        String dept = scanner.nextLine();
        
        System.out.println("YOUR ENROLLMENT NO IS " + enr_no);
        System.out.println("YOUR DEPARTMENT NAME IS " + dept);

        ArrayList<String> Rema_thareja = new ArrayList<>();
		Rema_thareja.add("Python Programming");
        Rema_thareja.add("DSA");
        Rema_thareja.add("Programming in c");
        Rema_thareja.add("Computer Fundamental");

        ArrayList<String> Ruskin_bond = new ArrayList<>();
        Ruskin_bond.add("The blue umbrella");
        Ruskin_bond.add("The perfect Murder");
        Ruskin_bond.add("The little book of happiness");

        ArrayList<String> Apj_abdul_kalam = new ArrayList<>();
        Apj_abdul_kalam.add("Wings of Fire");
        Apj_abdul_kalam.add("Mission of India");

        ArrayList<String> Bhim_Rao_Ambedkar = new ArrayList<>();
        Bhim_Rao_Ambedkar.add("Pakistan Or Partition Of India");
        Bhim_Rao_Ambedkar.add("The Untouchables");
        Bhim_Rao_Ambedkar.add("Thoughts on Pakistan");

        ArrayList<String> Rabindra_Nath_Tagor = new ArrayList<>();
        Rabindra_Nath_Tagor.add("Gitanjali");
        Rabindra_Nath_Tagor.add("Nationalism");
        Rabindra_Nath_Tagor.add("The Religion of Man");

        ArrayList<String> Sawami_Vivekananda = new ArrayList<>();
        Sawami_Vivekananda.add("Meditation and Its Methods");
        Sawami_Vivekananda.add("Motivating Thoughts");
        Sawami_Vivekananda.add("Reflections");

        System.out.print("Enter the book you want: ");
        String book_name = scanner.nextLine();

        int borrow_day;
        if (Rema_thareja.contains(book_name)||Ruskin_bond.contains(book_name)||
            Apj_abdul_kalam.contains(book_name)||Bhim_Rao_Ambedkar.contains(book_name)||
            Rabindra_Nath_Tagor.contains(book_name) || Sawami_Vivekananda.contains(book_name)){
            System.out.println("Book is available");
            System.out.print("Enter How many days you want to borrow the book: ");
            borrow_day = scanner.nextInt();
            System.out.println("*********");
            System.out.println("FOR " + borrow_day + " DAYS WANT "+book_name+" book.");
            System.out.println("*********");
			System.out.println("Thank you \nVisit Again:)");
            System.out.println("*********");
        }
		else {
            System.out.println("Your entered book name is not available in the library");
            System.out.println("*********");
            System.out.println("Thank you \nVisit Again:)");
            System.out.println("*********");
        }

        scanner.close();
    }
}