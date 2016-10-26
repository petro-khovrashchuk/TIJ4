//:Reusing Classes Ex.12

/**
 * Exercise 12: (3) Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
 *
 * Created by Petr on 08/03/2016.
 */

class Component1 {
    Component1() { System.out.println("Component1 was created"); }
    void dispose() { System.out.println("Component1 was disposed"); }
}

class Component2 {
    Component2() { System.out.println("Component2 was created"); }
    void dispose() { System.out.println("Component2 was disposed"); }
}

class Component3 {
    Component3() { System.out.println("Component3 was created"); }
    void dispose() { System.out.println("Component3 was disposed"); }
}

class Root {
    Component1 a;
    Component2 b;
    Component3 c;
    Root() {
        a = new Component1();
        b = new Component2();
        c = new Component3();
        System.out.println("Root was created");
    }
    void dispose() {
        System.out.println("Root was disposed");
        c.dispose();
        b.dispose();
        a.dispose();
    }
}

public class Stem extends Root{
    Component1 a;
    Component2 b;
    Component3 c;
    Stem() {
        System.out.print("Second ");
        a = new Component1();
        System.out.print("Second ");
        b = new Component2();
        System.out.print("Second ");
        c = new Component3();
        System.out.println("Stem was created");
    }
    void dispose() {
        System.out.println("Stem was disposed");
        System.out.print("Second ");
        c.dispose();
        System.out.print("Second ");
        b.dispose();
        System.out.print("Second ");
        a.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Stem inst = new Stem();
        System.out.println();
        try {
            // Code and exception handling
        }
        finally {
            inst.dispose();
        }
    }
}
