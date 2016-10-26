//:Reusing Classes Ex.13

/**
 * Exercise 13: (2) Create a class with a method that is overloaded three times. Inherit a new class, add a new
 * overloading of the method, and show that all four methods are available in the derived class.
 *
 * Created by Petr on 08/03/2016.
 */

class Base {
    void overloadedmethod() { System.out.println("overloaded method v.1"); }
    void overloadedmethod(short i) { System.out.println("overloaded method v.2"); }
    void overloadedmethod(int i) { System.out.println("overloaded method v.3"); }
}

public class Derived extends Base {
    void overloadedmethod(long i) { System.out.println("overloaded method v.4"); }
    void overloadedmethod(char c) { System.out.println("overloaded method v.5"); }
    void overloadedmethod(float f) { System.out.println("overloaded method v.6"); }

    public static void main(String[] args) {
        Derived instOfDerived = new Derived();
        instOfDerived.overloadedmethod();
        instOfDerived.overloadedmethod( (short)1 );
        instOfDerived.overloadedmethod( 1 );
        instOfDerived.overloadedmethod( (long)1 );
        instOfDerived.overloadedmethod('c');
        instOfDerived.overloadedmethod( (float)1 );
   }
}
