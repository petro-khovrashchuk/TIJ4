//:Reusing Classes Ex.9

/**
 * Exercise 9: (2) Create a class called Root that contains an instance of each of the classes (that you also create)
 * named Component1, Component2, and Component3. Derive a class Stem from Root that also contains an instance of each
 * “component.” All classes should have default constructors that print a message about that class.
 *
 * Created by Petr on 24/02/2016.
 */
class Component1 {
    Component1() { System.out.println("Component1 was created"); }
}

class Component2 {
    Component2() { System.out.println("Component2 was created"); }
}

class Component3 {
    Component3() { System.out.println("Component3 was created"); }
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
    public static void main(String[] args) {
        Stem inst = new Stem();
    }
}
