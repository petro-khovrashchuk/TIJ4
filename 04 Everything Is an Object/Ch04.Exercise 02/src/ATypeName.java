import static java.lang.System.out;

/**
 * Exercise 2: (1) Following the HelloDate.java example in this chapter, create a “hello, world” program that simply
 * displays that statement. You need only a single method in your class (the “main” one that gets executed when the
 * program starts). Remember to make it static and to include the argument list, even though you don’t use the argument
 * list. Compile the program with javac and run it using java. If you are using a different development environment than
 * the JDK, learn how to compile and run programs in that environment.
 *
 * Created by Petro Khovrashchuk on 02/10/2015.
 */

/** Class from the second Thinking in Java Exercise program. But quite reworked in my way for me to better understand.
 * Displays three values. First two - same variable from different objects one of which (variables) was increase by number two.
 * @author Petro Khovrashchuk
 * @version 1.0
 */
public class ATypeName {
    /** The variable that will be increased. */
    int a1 = 23;
    /** The method which have one value that it will print out. */
    void Show() {
        int a2 = 32;
        out.println(a2);
    }

    /** Entry point to the application and class. Application creates two objects. Then increase value of the one object by two
     * print out the same variable of two objects and call method Show() of the second object.
     * @param args array of string arguments.
     */
    public static void main(String[] args){
        ATypeName b = new ATypeName();
        ATypeName c = new ATypeName();
        c.a1 += 2;
        System.out.println(b.a1);
        System.out.println(c.a1);
        b.Show();  

    }
}
