/**
 * Exercise 8: (3) Write a program that demonstrates that, no matter how many objects you create of a particular class,
 * there is only one instance of a particular static field in that class.
 *
 * Created by Petro Khovrashchuk on 20/10/2015.
 */

public class StaticFieldExample {
    static int sa;
    int a;

    void increment() {
        sa++;
        a++;
    }

    public static void main(String[] args) {
        StaticFieldExample a = new StaticFieldExample();
        StaticFieldExample b = new StaticFieldExample();
        System.out.println("Static a's:");
        System.out.println(a.sa);
        System.out.println(b.sa);
        System.out.println("NonStatic a's:");
        System.out.println(a.a);
        System.out.println(b.a);
        a.increment();
        System.out.println("Increment() a");
        System.out.println("Static a's:");
        System.out.println(a.sa);
        System.out.println(b.sa);
        System.out.println("NonStatic a's:");
        System.out.println(a.a);
        System.out.println(b.a);
        b.increment();
        System.out.println("Increment() b;");
        System.out.println("Static a's:");
        System.out.println(a.sa);
        System.out.println(b.sa);
        System.out.println("NonStatic a's:");
        System.out.println(a.a);
        System.out.println(b.a);
    }
}

