import static debug.ClassOfDebugAndDebugoff.*; // Debug package prints out the message that's been sent.
import static debugoff.ClassOfDebugAndDebugoff.*; // Debugoff package's method doesn't have an Argument.

/**
 * Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a debug( ) method. The
 * first version displays its String argument to the console, the second does nothing. Use a static import line to
 * import the class into a test program, and demonstrate the conditional compilation effect.
 *
 * Created by Petro Khovrashchuk on 18/02/2016.
 */

public class ConditionalCompilationEffectDebugAndDebugoff { /* Created this class to show that if methods from different
                                                             * packages have different parameter signature we can use
                                                             * both methods and import both packages without specifying
                                                             * the names. No clashes will occur. */
    public static void main(String[] args) {
        debug();
        debug("Print this baby out ;)");
    }
}