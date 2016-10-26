//:Reusing Classes Ex.23
import static net.mindview.util.Print.*;

/**
 * Exercise 23: (2) Prove that class loading takes place only once. Prove that loading may be caused by either the
 * creation of the first instance of that class or by the access of a static member.
 *
 * Created by Petr on 17/03/2016.
 */

public class TheOneWhichIsLoaded {
    static { // static clauses are executed upon class loading
        print("TheOneWhichIsLoaded has been loaded.");
    }
    static int justAStaticField1;

    static int justAStaticField2 = printAtInitialization(0,"justAStaticField2");
    TheOneWhichIsLoaded() { System.out.println("TheOneWhichIsLoaded has been created.");}
    static int printAtInitialization(int i, String s) {
        print(s + " has been initialized; Value = " + i +";");
        return i;
    }
}

/* Loading caused by the creation of the first instance of a class */
class TheFirstWhichIsLoading {
    public static void main(String[] args) {
        print("TheFirstWhichIsLoading:");
        new TheOneWhichIsLoaded();
    }
}

/* Loading caused by the creation of the access of a static member */
class TheSecondWhichIsLoading {
    public static  void main(String[] args) {
        print("TheSecondWhichIsLoading:");
        TheOneWhichIsLoaded.justAStaticField1 = 1;  /* notice that you're changing another static field then message of
                                                     * initialization of which you'll get in console */
    }
}
