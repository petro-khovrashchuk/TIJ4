/**
 * Exercise 1: (2) Create a class containing an int and a char that are not initialized, and print their values to
 * verify that Java performs default initialization.
 *
 * Created by Petro Khovrashchuk on 02/10/15.
 */

public class ClassWithIntAndChar {
    int i;
    char c;

    public ClassWithIntAndChar() {
        //int i; //TODO
        System.out.println("It's working, right or wrong...");
        System.out.println("i = " + i);
        System.out.println("c = [" + c + "]");
    }

    public static void main(String[] args) {
        ClassWithIntAndChar T = new ClassWithIntAndChar();
        //T.ClassWithIntAndChar();
    }
}
