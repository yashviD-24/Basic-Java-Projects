//multiple inheritance using interface
//one class can implement more than one interface
interface Bird
{
 public void fly();
}
 
interface Speak
{
public void speak();
}

class Parrot implements Bird,Speak
{
@Override
 public void fly()
{
  System.out.println("i can fly");
}

@Override
public void speak()
{
System.out.println("i can speak");
}
}
class InterfaceMultipleInheritance
{
public static void main(String []args)
{
Parrot a=new Parrot();
a.fly();
a.speak();
}
  }