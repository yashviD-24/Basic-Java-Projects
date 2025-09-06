class Vehicle{
	public void fourWheel(){
		System.out.println("My car has four wheels");
	}
}
class Car extends Vehicle{
	public void petrol(){
		System.out.println("My car uses petrol!");
	}
}
class Name extends Car{
	public void carName(){
		System.out.println("I call my car Rocket....!");
	}
}
class MultiLevelInheritance{
	public static void main(String[] args){
		Name n=new Name();
		n.fourWheel();
		n.petrol();
		n.carName();
	}
}