import static truedebugoff.ClassOfDebugAndDebugoff.*; // Debug package doesn't print out the message that's been sent.

/**
 * Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a debug( ) method. The
 * first version displays its String argument to the console, the second does nothing. Use a static import line to
 * import the class into a test program, and demonstrate the conditional compilation effect.
 *
 * Created by Petro Khovrashchuk on 18/02/2016.
 */

public class ConditionalCompilationEffectDebugoff {
    public static void main(String[] args) {
        debug("Print this babe out ;)");
    }
}