//:Initialization&Cleanup Ex.8

import static net.mindview.util.Print.*;

/**
 * Exercise 8: (1) Create a class with two methods. Within the first method, call the second method twice: the first
 * time without using this, and the second time using this—just to see it working; you should not use this form in
 * practice.
 *
 * Created by Petr on 14/02/2016.
 */

public class ClassWithTwoMethods {
    String message = "Initial message";

    int firstMethod() {
        message +=", firstMethod's been here";
        secondMethod();
        this.secondMethod();
        return 1;
    }

    int secondMethod() {
        message +=", secondMethod's been here";
        return 1;
    }

    public static void main(String[] args) {
        ClassWithTwoMethods ent = new ClassWithTwoMethods();
        ent.firstMethod();
        print(ent.message + ".");
    }
}
