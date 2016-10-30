import static net.mindview.util.Print.*;

/**
 * Exercise 10: (2) Create a class with a finalize( ) method that prints a message. In main( ), create an object of your
 * class. Explain the behavior of your program.
 *
 * Created by Petro Khovrashchuk on 14/02/2016.
 */

//TODO Explain the behavior the program. Check the comment down bellow. Check rather it's true...

public class ClassWithFinalizeMethodThatPrintsMessage {
    protected void finalize() {
        print("Bye. I've been finalized.");
    }
    public static void main(String[] args) {
        new ClassWithFinalizeMethodThatPrintsMessage(); /* Apparently program doesn't store enough of memory for Garbage
                                                         * Collector to be called. So there is no printing of message
                                                         * during execution */

    }
}
