//:Initialization&Cleanup Ex.13

/**
 * Exercise 13: (1) Verify the statements in the previous paragraph. (Page 131)
 *
 * Created by Petr on 15/02/2016.
 */

// Explicit static initialization with the "static" clause.
import static net.mindview.util.Print.*;
class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}
class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        print("Cups()");
    }
}
public class ExplicitStatic {
    public static void main(String[] args) {
        print("Inside main()");
        Cups.cup1.f(99); // (1)
    }
    //static Cups cups1 = new Cups(); // (2)    // Only during Object Initialization Constructors will be called!!!
    //static Cups cups2 = new Cups(); // (2)
}