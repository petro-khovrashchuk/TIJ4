/**
 * Exercise 11: (4) Modify the previous exercise so that your finalize( ) will always be called.
 *
 * Created by Petro Khovrashchuk on 14/02/2016.
 */

class ClassWithFinalizeMethodThatPrintsMessage {
    protected void finalize() {
        System.out.println("Bye. I've been finalized.");
    }
}

public class TheOneWithMainInIt {
    public static void main(String[] args) {
        new ClassWithFinalizeMethodThatPrintsMessage(); // With Definition the Method finalize() won't be executed.
        System.gc();
        System.runFinalization();
    }
}