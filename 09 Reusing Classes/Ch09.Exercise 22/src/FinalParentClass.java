//:Reusing Classes Ex.22

/**
 * Exercise 22: (1) Create a final class and attempt to inherit from it.
 *
 * Created by Petr on 17/03/2016.
 */

public final class FinalParentClass {
    String greatings = "Hello, world!";

    public static void main(String[] args) {
        FinalParentClass ins = new FinalParentClass();
        System.out.println(ins.greatings);
    }
}

//! class InheritedFromFinalParentClass extends FinalParentClass {} // you can't inherit from final parent class.
