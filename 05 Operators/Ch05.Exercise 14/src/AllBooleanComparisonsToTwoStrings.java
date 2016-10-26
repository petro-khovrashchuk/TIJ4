/**
 * Exercise 14: (3) Write a method that takes two String arguments and uses all the boolean comparisons to compare the
 * two Strings and print the results. For the == and !=, also perform the equals( ) test. In main( ), call your method
 * with some different String objects.
 *
 * Created by Petro Khovrashchuk on 07/01/2016.
 */

public class AllBooleanComparisonsToTwoStrings {
    static void allBooleanComparisons(String s1, String s2) {
        System.out.println("String 1: " + s1 + "    String 2: " + s2);
        //!if (s1 > s2) System.out.println("s1 > s2"); //TODO Description
        //!if (s1 < s2) System.out.println("s1 < s2");
        //!if (s1 >= s2) System.out.println("s1 >= s2");
        //!if (s1 <= s2) System.out.println("s1 <= s2");
        System.out.print("1. s1 == s2: ");
        if (s1 == s2) System.out.println("True"); else System.out.println("False");
        System.out.print("2. s1 != s2: ");
        if (s1 != s2) System.out.println("True"); else System.out.println("False");
        System.out.print("3. s1.equals(s2): ");
        if (s1.equals(s2)) System.out.println("True\n"); else System.out.println("False\n");
    }
    public static void main (String[] Args) {
        allBooleanComparisons("Hello", "Hello");
        allBooleanComparisons("Hello", "Goodbye");
        allBooleanComparisons("Goodbye", "Hello");
        allBooleanComparisons("Goodbye", "Goodbye");

        System.out.println("\nTwo new string-objects were created: \"Hello\" and \"Goodbye\"" +
                "\nNext two Comparisons will be applied to four different objects\n");
        String Str1 = new String("Hello");
        String Str2 = new String("Goodbye");

        allBooleanComparisons(Str1, "Hello");
        allBooleanComparisons(Str2, "Goodbye");
    }
}
