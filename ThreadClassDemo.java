// Java program to demonstrate multithreading
// Two threads are created to print "Thread1" and "Thread2" messages.
class ThreadOne extends Thread{
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println("Thread1");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
class ThreadTwo extends Thread{
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println("Thread2");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
public class ThreadClassDemo{
	public static void main(String args[]){
		ThreadOne o=new ThreadOne();
		ThreadTwo t=new ThreadTwo();		
		o.start();
		t.start();
	}
}