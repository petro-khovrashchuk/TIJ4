//:Reusing Classes Ex.8

/**
 * Exercise 8: (1) Create a base class with only a non-default constructor, and a derived class with both a default
 * (no-arg) and non-default constructor. In the derived-class constructors, call the base-class constructor.
 *
 * Created by Petr on 24/02/2016.
 */
class Base {
    Base(String s) { System.out.println("Base: " + s);}
}

public class Derived extends Base {
    Derived() {
        super("without arguments");
        System.out.println("Derived: constructor without arguments");
    }
    Derived(String s) {
        super(s);
        System.out.println("Derived: " + s);
    }
    public static void main(String[] args) {
        System.out.println("Instance 1:");
        Derived ins1 = new Derived();
        System.out.println();
        System.out.println("Instance 2:");
        Derived ins2 = new Derived("Created");
    }
}
