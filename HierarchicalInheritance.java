//Hierarchical Inheritance
class Vehicle{
	public void fourWheel(){
		System.out.println("A car has four wheels");
	}
}
class Car1 extends Vehicle{
	public void petrol(){
		System.out.println("Some cars use petrol...");
	}
}
class Car2 extends Vehicle{
	public void diesel(){
		System.out.println("Some cars use diesel...");
	}
}
class HierarchicalInheritance{
	public static void main(String[] args){
		Car1 c=new Car1();
		c.fourWheel();
		c.petrol();
		Car2 c2=new Car2();		
		c2.diesel();
	}
}