/**
 * Exercise 14: (1) Create a class with a static String field that is initialized at the point of definition, and
 * another one that is initialized by the static block. Add a static method that prints both fields and demonstrates
 * that they are both initialized before they are used.
 *
 * Created by Petro Khovrashchuk on 15/02/2016.
 */

class StringFromOutOfMainClass {
    static String field0 = "I'm the string which's been sent into outer space.";
}
class DemonstrationOfTwoInitializedStaticStringFields {
    static String field1 = "I'm the first static string.";
    static String field2;
    static {
        field2 = "I'm the second static string.";
    }
    static void printBothStaticFields() {
        System.out.println(field1 + "\n" + field2);
    }


    public static void main(String[] args) {
        printBothStaticFields();
        //System.out.println(StringFromOutOfMainClass.field0);  /* Even field0 is from outer class we can use it without
                                                                /* creating the object. Though you need to specify its
                                                                 * class */
    }
}
