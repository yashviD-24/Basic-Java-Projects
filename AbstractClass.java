// Create an abstract class 'Shape' with an abstract method 'area()'.
// Create three subclasses 'Triangle', 'Rectangle', and 'Circle' that extend the 'Shape' class.
// Each subclass should provide its own implementation of the 'area()' method to calculate the area
abstract class Shape {
    public abstract double area();
}

class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    @Override
    public double area() {
        return (base*height)/ 2;
    }
}

class Rectangle extends Shape {
    double l;
    double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double area() {
        return l * w;
    }
}


class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
        @Override
        public double area() {
            return 3.14 * radius * radius;
        }
    }

public class AbstractClass {
    public static void main(String[] args) {
        Shape triangle =new Triangle(10,5);
        Shape rectangle =new Rectangle(10,5);
        Shape circle= new Circle(5);

        System.out.println("Area of Triangle:" + triangle.area());
        System.out.println("Area of Rectangle:" + rectangle.area());
        System.out.println("Area of Circle:" + circle.area());
    }
}