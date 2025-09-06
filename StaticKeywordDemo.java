// Static variable example
// Static variable is shared among all instances of the class
class StaticDemo
{
	static int count=0;
	StaticDemo()
	{
		count++;
		System.out.println(count);
	}
}
public class StaticKeywordDemo
{
	public static void main(String[] args)
	{
		StaticDemo demo1 = new StaticDemo();
		StaticDemo demo2 = new StaticDemo();
		StaticDemo demo3 = new StaticDemo();
	}
}