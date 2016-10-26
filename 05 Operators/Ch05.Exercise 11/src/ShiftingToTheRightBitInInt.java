/**
 * Exercise 11: (3) Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal
 * constant). Using the signed right-shift operator, right shift it all the way through all of its binary positions,
 * each time displaying the result using Integer.toBinaryString( ).
 *
 * Created by Petro Khovrashchuk on 10/12/2015.
 */

public class ShiftingToTheRightBitInInt {
    static final int aNumbWithBinary = 0x80000000;

    static void shiftToTheRightAndPrint(int number, int howMuchToShift){
        number >>= howMuchToShift;
        System.out.println(Integer.toBinaryString(number));
    }
    public static void main (String[] args) {
        System.out.println(Integer.toBinaryString(aNumbWithBinary));
        for (int i = 1; i <= 31; i++) {
            shiftToTheRightAndPrint(aNumbWithBinary, i);
        }
    }
}
