//:Initialization&Cleanup Ex.9

import static net.mindview.util.Print.*;

/**
 * Exercise 9: (1) Create a class with two (overloaded) constructors. Using this, call the second constructor inside the
 * first one.
 *
 * Created by Petr on 14/02/2016.
 */

public class ClassWithTwoOverloadedConstructors {
    ClassWithTwoOverloadedConstructors() { this("Second overloaded Constructor's been called. Messaging you from " +
            "there:). Weather is fine here."); }
    ClassWithTwoOverloadedConstructors(String fInpStr) { print(fInpStr); }

    public static void main(String[] args) {
        ClassWithTwoOverloadedConstructors ent = new ClassWithTwoOverloadedConstructors();
    }
}
