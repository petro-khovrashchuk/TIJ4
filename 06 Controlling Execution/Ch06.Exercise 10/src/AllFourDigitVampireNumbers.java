/**
 * Exercise 10: (5) A vampire number has an even number of digits and is formed by multiplying a pair of numbers
 * containing half the number of digits of the result. The digits are taken from the original number in any order.
 * Pairs of trailing zeroes are not allowed. Examples include:
 * 1260 = 21 * 60
 * 1827 = 21 * 87
 * 2187 = 27 * 81
 * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 *
 * Created by Petro Khovrashchuk on 08/01/2016.
 */

public class AllFourDigitVampireNumbers {
    static int[] masN = new int[4]; // Array for each digit of two numbers.
    static int[] masR = new int[4]; // Array for each digit of the result of multiplication.
    static int[] vampires = new int[20]; // Array for Vampires.

    static int preCheckForm(int ab, int cd, int res) {
        int a1 = ab/10; // First digit of the first number.
        int a2 = ab%10; // Second digit of the first number.
        int b1 = cd/10; // First digit of the second number.
        int b2 = cd%10; // Second digit of the second number.
        int resFs = res/1000; // First digit of the result of multiplication.
        int resS = (res%1000)/100; // Second digit of the result of multiplication.
        int resT = ((res%1000)%100)/10; // Third digit of the result of multiplication.
        int resFt = (((res%1000)%100)%10); // Fourth digit of the result of multiplication.
        masN[0] = a1; masN[1] = a2; masN[2] = b1; masN[3] = b2;
        masR[0] = resFs; masR[1] = resS; masR[2] = resT; masR[3] = resFt;
        return 1;
    }

    static boolean vampireCheck(int[] masN, int[] masR) {
        int i, j, c;
        c = 0;
        for (i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                if (masN[i] == masR[j]) {
                    c++;
                    masN[i] = masR[j] = 99; /* If one of the digits of the numbers matches to one of the digits of
                                             * result their value's changed to "99" (arbitrary number that never can
                                             * be considered as value of one particular digit), so they will be taken
                                             * out of the picture to avoid unwanted miscalculation.
                                             * For instance: "19*91=1729" would be considered as a Vampire otherwise.*/
                    break;
                }
            }
        }
        return (c == 4);
    }

    static boolean duplicationCheck(int att, int[] array) {
        int i = 0;
        while(array[i] != 0) {
            if (att == array[i]) {
                return false;
            }
        i++;
        }
        return true;
    }

    static int vampiresPrint(int[] array) {
        int i = 0;
        while(array[i] != 0) {
            System.out.println(i + 1 + ": " + array[i]);
            i++;
        }
        return 1;
    }

    public static void main (String[] Args) {
        int lNum , rNum, res, i;
        i = 0;

        for (lNum = 10 ; lNum <= 99; lNum++) {
            for (rNum = 10 ;rNum <= 99; rNum++) {
                if (((rNum%10) == 0)&&((lNum%10) == 0)) rNum++; // Avoiding two numbers ending with 0
                res = lNum * rNum;
                if (res >= 1000) {
                    preCheckForm(lNum, rNum, res); // Formatting of numbers and result in convenient form to be checked
                    if (vampireCheck(masN, masR)) {
                        if(duplicationCheck(res, vampires)) { /* Checking that array doesn't already have value that's
                                                               * about to be written in. */
                            vampires[i] = res;
                            i++;
                        }
                        //System.out.println(rNum + " " + lNum + " " + res);
                    }
                }
            }
        }
        vampiresPrint(vampires);
    }
}
