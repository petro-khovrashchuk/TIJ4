//:Initialization&Cleanup Ex.7

import static net.mindview.util.Print.*;

/**
 * Exercise 7: (1) Create a class without a constructor, and then create an object of that class in main( ) to verify
 * that the default constructor is automatically synthesized.
 *
 * Created by Petr on 13/02/2016.
 */

public class ClassWithoutConstructor {
    String message = "Won't find manually created Constructor here";

    public static void main (String[] args) {
        ClassWithoutConstructor ent = new ClassWithoutConstructor();

        print(ent.message);
    }
}
