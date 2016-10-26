//:Reusing Classes Ex.15

import apackage.ClassInside;

/**
 * Exercise 15: (2) Create a class inside a package. Your class should contain a protected method. Outside of the
 * package, try to call the protected method and explain the results. Now inherit from your class and call the protected
 * method from inside a method of your derived class.
 *
 * Created by Petr on 16/03/2016.
 */

public class ClassOutside {
    public static void main(String[] args) {
        ClassInside ins = new ClassInside();
        //! ins.method(); /* because method is protected, access to it can be performed only via inheritance or within
                          /* the package */
    }
}

class InheritedClassOutside extends ClassInside {
    public static void main(String[] args) {
        InheritedClassOutside ins = new InheritedClassOutside();
        ins.method();
    }
}
