//:Reusing Classes Ex.21

/**
 * Exercise 21: (1) Create a class with a final method. Inherit from that class and attempt to overwrite that method.
 *
 * Created by Petr on 17/03/2016.
 */

class ParentClassWithFinalMethod {
    final void method() { System.out.println("Parent method."); }
}

public class ChildClass extends ParentClassWithFinalMethod {
    //! @Override
    //! void method() { System.out.println("Child method."); } // you can't override parent's final method

    public static void main(String[] args) {
        ChildClass ins = new ChildClass();
        ins.method();
    }
}
