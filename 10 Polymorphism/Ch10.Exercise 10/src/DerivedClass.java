/**
 * Exercise 10: (3) Create a base class with two methods. In the first method, call the second method. Inherit a class
 * and override the second method. Create an object of the derived class, upcast it to the base type, and call the first
 * method. Explain what happens.
 *
 * Created by Petro Khovrashchuk on 02/07/2016.
 */

class BaseClassWithTwoMethods {
    void methodOne() {
        System.out.println("Base class method One.");
        methodTwo();
    }
    void methodTwo() { System.out.println("Base class method Two."); }
}

public class DerivedClass extends BaseClassWithTwoMethods {
    void methodTwo() {
        System.out.println("Derived class method Two.\n");
    }

    public static void main( String[] args ) {
        BaseClassWithTwoMethods inst = new DerivedClass();
        inst.methodOne();
        inst.methodTwo();
    }
}

/* Because even class is derived it still holds methods of base class, so call of the first method executes normally.
   Then when call of the second method from the first method appears, because of the late binding during the
   execution executes method of the derived class, and not method of the base class.
   P.S. According to the solution guide Java always uses the most derived method for the object type.
 */