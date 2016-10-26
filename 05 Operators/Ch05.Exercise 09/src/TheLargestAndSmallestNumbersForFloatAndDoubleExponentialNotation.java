/**
 * Exercise 9: (1) Display the largest and smallest numbers for both float and double exponential notation.
 *
 * Created by Petro Khovrashchuk on 29/11/2015.
 */

public class TheLargestAndSmallestNumbersForFloatAndDoubleExponentialNotation {
    static float sf = Float.MIN_VALUE;
    static float lf = Float.MAX_VALUE;
    static double sd = Double.MIN_VALUE;
    static double ld = Double.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println("Float Smallest = " + sf);
        System.out.println("Float Largest = " + lf + "\n");

        System.out.println("Double Smallest = " + sd);
        System.out.println("Double Largest = " + ld);
    }
}
