// Java program to demonstrate inheritance
// A base class Vehicle is created and a derived class Car inherits from it.
class Vehicle{
	public void fourWheel(){
		System.out.println("My car has four wheels");
	}
}
class Car extends Vehicle{
	public void petrol(){
		System.out.println("My car uses petrol...");
	}
}
class SingleInheritance{
	// This class contains the main method to demonstrate single inheritance.
	public static void main(String[] args){
		Car myCar=new Car();
		myCar.fourWheel();
		myCar.petrol();
	}
}