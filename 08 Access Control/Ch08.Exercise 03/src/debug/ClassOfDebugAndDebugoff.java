package debug;
//:debug
//:Access Control Ex.3

/**
 * Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a debug( ) method. The
 * first version displays its String argument to the console, the second does nothing. Use a static import line to
 * import the class into a test program, and demonstrate the conditional compilation effect.
 *
 * Created by Petr on 18/02/2016.
 */

public class ClassOfDebugAndDebugoff {
    public static void debug(String msg) {
        System.out.println(msg);
    }
}
