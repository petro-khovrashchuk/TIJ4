/**
 * Exercise 1: (1) Write a program that prints values from 1 to 100.
 *
 * Created by Petro Khovrashchuk on 09/01/2016.
 */

public class PrintsValuesFromOneToHundred {
    static int countAndPrint(int start, int finish) {
        for(int i = start ;i <= finish; i++) {
            System.out.println(i);
        }
        return 1;
    }

    public static void main(String[] args) {
        int from = 1;
        int to = 100;

        countAndPrint(from, to);
    }
}
