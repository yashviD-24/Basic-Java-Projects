// Java program to demonstrate multithreading
// Two threads are created to print odd and even numbers up to 200.
class OddThread extends Thread{
	OddThread(String s){
		super(s);
	}
	@Override
	public void run(){
		for(int i=1;i<200;i+=2){
			System.out.println("Odd: "+i);
			try{
				// Suppressed: Thread.sleep called in loop for demonstration purposes
								Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
class ThreadDemo2 extends Thread{
	ThreadDemo2(String s){
		super(s);
	}
	@Override
	public void run(){
		for(int i=2;i<200;i+=2){
			System.out.println("Even: "+i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
public class MultiThreadingExample {
	public static void main(String args[]){
		OddThread t1 = new OddThread("odd");
		ThreadDemo2 t2 = new ThreadDemo2("even");
		t1.start();
		t2.start();
	}
}