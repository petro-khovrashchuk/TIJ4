//:Initialization&Cleanup Ex.11

/**
 * Exercise 10: (2) Create a class with a finalize( ) method that prints a message. In main( ), create an object of your
 * class. Explain the behavior of your program.
 *
 * Created by Petr on 14/02/2016.
 */

class ClassWithFinalizeMethodThatPrintsMessage {
    protected void finalize() {
        System.out.println("Bye. I've been finalized.");
    }
}

public class TheOneWithMainInIt {
    public static void main(String[] args) {
        new ClassWithFinalizeMethodThatPrintsMessage(); // With Definition Method finalize won't execute.
        System.gc();
        System.runFinalization();
    }
}
