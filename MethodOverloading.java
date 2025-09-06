// Java program to demonstrate method overloading
//area of circle and rectangle
class MethodOverloading 
{
    float area=0.0f;
    public void area(int r)
    {
        area=3.14f*r*r;
        System.out. println("area of circle is:"+area);
    }
    public void area(int l,int w)
    {
        area=l*w;
        System.out.println("area of Rectangle is:"+area);
    }
     public static void main(String args[])
    {
        MethodOverloading cal=new MethodOverloading();
        cal.area(10);
        cal.area(20,35);
    }
}                                                         