class Main {

    // Method with 2 parameters
    int addition(int a, int b) {
        return a + b;
    }

    // Method with 3 parameters (Overloaded)
    int addition(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Main obj = new Main(); // Create object

        int sum1 = obj.addition(10, 20);
        int sum2 = obj.addition(10, 20, 30);

        System.out.println("Sum of 2 numbers: " + sum1);
        System.out.println("Sum of 3 numbers: " + sum2);
    }
}


class Parent {
    void show() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is Child class overridden method");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Parent obj = new Child();   // Parent reference, Child object
        obj.show();                 // Calls Child's method (overridden)
    }
}
