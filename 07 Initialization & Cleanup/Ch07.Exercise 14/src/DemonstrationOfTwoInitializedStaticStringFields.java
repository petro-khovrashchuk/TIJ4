//:Initialization&Cleanup Ex.14

/**
 * Exercise 14: (1) Create a class with a static String field that is initialized at the point of definition, and
 * another one that is initialized by the static block. Add a static method that prints both fields and demonstrates
 * that they are both initialized before they are used.
 *
 * Created by Petr on 15/02/2016.
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
        //StringFromOutOfMainClass inst = new StringFromOutOfMainClass();
        //System.out.println(inst.field0);  /* Even if Field field0 is static, because it's from outer class we need
                                            /* create the Object of its class to gain access */
    }
}
