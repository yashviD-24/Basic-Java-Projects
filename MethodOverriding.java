//Example of Method Overriding
class Car{
	public void name(){
		System.out.println("I like BMW");
	}
}
class Car1 extends Car{
	public void name(){
		System.out.println("I like GTR");
	}
}
class MethodOverriding{
	public static void main(String args[]){
		Car c=new Car();
		c.name();
		Car1 c2=new Car1();
		c2.name();
	}
}