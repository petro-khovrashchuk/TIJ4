//:Reusing Classes Ex.2

/**
 * Exercise 2: (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( ).
 *
 * Created by Petr on 24/02/2016.
 */

import static net.mindview.util.Print.*;
class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { this.s += a; } /* methods can't be private, cause you're actually using methods from
                                                   * here and not their copies. */
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}
public class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);

        NewClass.main(args);
    }
}

class NewClass extends Detergent {
    public void scrub() {
        append(" NewClass.scrub()");
        super.scrub(); // as you can see from the output super class is a parent class, not grand-parent :)
    }
    public void sterilize() {
        append(" sterilize()");
    }
    public static void main(String[] args) {
        NewClass x = new NewClass();
        x.scrub();
        x.sterilize();
        x.dilute();
        print(x);
    }
}