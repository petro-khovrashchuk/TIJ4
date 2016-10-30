/**
 * Exercise 12: (4) Create a class called Tank that can be filled and emptied, and has a termination condition that it
 * must be empty when the object is cleaned up. Write a finalize( ) that verifies this termination condition.
 * In main( ), test the possible scenarios that can occur when your Tank is used.
 *
 * Created by Petro Khovrashchuk on 14/02/2016.
 */

public class Tank {
    boolean isFool;
    String name;  // String which contains name of a Tank Object

    Tank(String str) {
        isFool = false;
        name = str;
    }

    void fill() {
        isFool = true;
        System.out.println("Tank " + name + " was filled.");
    }
    void empty() {
        isFool = false;
        System.out.println("Tank " + name + " was emptied.");
    }

    protected void finalize() {
        if (isFool) // Termination Condition
            System.out.println("Error: Tank " + name + " must be emptied before it will be Cleaned Up");
        else
            System.out.println("Tank " + name + " was cleaned up.");
    }

    public static void main(String[] args) { //TODO Explain why does it happens.
        Tank kvrs = new Tank("kvrs"); // Won't even run finalize()
        Tank istl = new Tank("istl"); // Won't even run finalize()
        new Tank("noname1"); // Tank without reference, haven't been filled
        new Tank("noname2").fill(); /* Tank without reference, have been filled. Only this one will trigger Termination
                                     * Condition. */

        kvrs.fill();
        istl.fill(); /* Don't understand why this, referenced but not emptied Tank doesn't trigger Termination
                      * Condition. */

        kvrs.empty();

        System.gc();
        System.runFinalization();
    }
}