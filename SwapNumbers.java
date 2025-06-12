// This Java program swaps two numbers without using a third variable.
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Swapping without using third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Output the swapped values
        System.out.println("After swapping:");
        System.out.println("First number (a) = " + a);
        System.out.println("Second number (b) = " + b);

        scanner.close();
    }
}

// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of Dog
        Dog myDog = new Dog();

        // Call methods from both Dog and Animal class
        myDog.eat();   // Inherited method
        myDog.bark();  // Child class method
    }
}
