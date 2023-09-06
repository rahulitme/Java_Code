package firstprgm;

import java.util.Scanner;

// Use lowercase for the interface name (convention)
interface Neha {
    void input();
    void output();
}

// Class names should start with an uppercase letter (convention)
class InterfaceClass implements Neha {
    // Declare variables 'a' and 'b' as instance variables to make them accessible in other methods
    int a, b;

    // Correct the method signature by adding parentheses '()' after the method name
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:"); // This seems like it should be "Enter your number:"
        a = sc.nextInt(); // Store the input in 'a'
        System.out.println("Enter your name:"); // This seems like it should be "Enter your number:"
        b = sc.nextInt(); // Store the input in 'b'
    }

    // Correct the method signature by adding parentheses '()' after the method name
    public void output() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Neha c = new InterfaceClass(); // Use the interface type for reference
        c.input();
        c.output();
    }
}
