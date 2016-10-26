//:Reusing Classes Ex.1

/**
 * Exercise 1: (2) Create a simple class. Inside a second class, define a reference to an object of the first class.
 * Use lazy initialization to instantiate this object.
 *
 * Created by Petr on 24/02/2016.
 */

public class SimpleOne {
    String msg = "I'm a simple class";

    public String toString() {
        return msg;
    }
}

class OneWithReferenceToSimpleOne {
    SimpleOne ins;
    void print() {
        System.out.println(ins = new SimpleOne());
    }
    public static void main (String[] args) {
        new OneWithReferenceToSimpleOne().print();
    }
}
