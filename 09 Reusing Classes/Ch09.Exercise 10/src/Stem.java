//:Reusing Classes Ex.10

/**
 * Exercise 10: (1) Modify the previous exercise so that each class only has non-default constructors.
 *
 * Created by Petr on 24/02/2016.
 */

class Component1 {
    Component1(String s) { System.out.println(s + " Component1 was created"); }
}

class Component2 {
    Component2(String s) { System.out.println(s + " Component2 was created"); }
}

class Component3 {
    Component3(String s) { System.out.println(s + " Component3 was created"); }
}

class Root {
    Component1 a;
    Component2 b;
    Component3 c;
    Root(String s) {
        a = new Component1("First");
        b = new Component2("First");
        c = new Component3("First");
        System.out.println(s + " was created");
    }
}

public class Stem extends Root{
    Component1 a;
    Component2 b;
    Component3 c;
    Stem(String s) { /* noticed that if constructor of derived class does have an arguments it's not necessary for
                      * super-class to have them. It can have just a default constructor. Or just let the compiler
                      * create one for you */
        super("Root");
        a = new Component1("Second");
        b = new Component2("Second");
        c = new Component3("Second");
        System.out.println(s + " was created");
    }
    public static void main(String[] args) {
        Stem inst = new Stem("Stem");
    }
}
