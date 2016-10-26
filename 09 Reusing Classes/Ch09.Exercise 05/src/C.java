//:Reusing Classes Ex.5

/**
 * Exercise 5: (1) Create two classes, A and B, with default constructors (empty argument lists) that announce
 * themselves. Inherit a new class called C from A, and create a member of class B inside C. Do not create a constructor
 * for C. Create an object of class C and observe the results.
 *
 * Created by Petr on 24/02/2016.
 */

class A {
    A() { System.out.println("Class A"); }
}

class B {
    B() { System.out.println("Class B"); }
}

public class C extends A {
    B b = new B();
    public static void main(String[] args) {
        C c = new C();
    }
}
