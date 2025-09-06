// Java program to demonstrate file handling
// Creating, writing, and reading a file using File, FileOutputStream, and FileInputStream classes.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingExample{
	public static void main(String args[]){
	File f1=new File("Test.txt");
	try{
		f1.createNewFile();
	}	
	catch(IOException e){
		System.out.println(e.getMessage());
	}
	try{
		try (FileOutputStream f2 = new FileOutputStream("Test.txt")) {
			String s = "This is a file demo.";
			byte b[] = s.getBytes();
			f2.write(b);
			System.out.println("Write operatoe conpeted");
		}
		try (FileInputStream f3 = new FileInputStream("Test.txt")) {
			int c;
			System.out.println("content of file:");
			while ((c = f3.read()) != -1) {
				System.out.println((char) c);
			}
		}
	}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}