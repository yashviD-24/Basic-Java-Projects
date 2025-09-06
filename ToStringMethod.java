//WAP to create a class Car with attributes topSpeed and name. 
//Create 5 objects of the class and print the details of each car.
//Use toString() method to print the details.
class Car
{
	int topSpeed;
	String name;
	public Car(int topSpeed, String name)
	{
		this.topSpeed=topSpeed;
		this.name=name;
	}
	public String toString()
	{
		return"topSpeed: "+topSpeed+" name: "+name+" ";
	}
}
class ToStringMethod{	
     public static void main(String args[])
    {Car car1=new Car(110,"suzuki");
	Car car2=new Car(200,"BMW");
	Car car3=new Car(220,"Mercedes");
	Car car4=new Car(150,"Honda");
	Car car5=new Car(140,"Mahindra");
	
	System.out.println(car1);
	System.out.println(car2);
	System.out.println(car3);
	System.out.println(car4);
	System.out.println(car5);
        
    }
}                                                         