// final class cannot be inherited
final class MyClass {
    final int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        MyClass a = new MyClass(10);
        System.out.println("value: " + a.getValue());
    }
}