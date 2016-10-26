//:Reusing Classes Ex.7

/**
 * Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
 * Write a constructor for C and perform all initialization within C’s constructor.
 *
 * Created by Petr on 24/02/2016.
 */

class A {
    A(int a) { System.out.println("Class A"); }
}

class B {
    B(char b) { System.out.println("Class B"); }
}

public class C extends A {
    C() {
        super(1);
        System.out.println("Class C");
    }
    B b = new B('a');
    public static void main(String[] args) {
        C c = new C();
    }
}
