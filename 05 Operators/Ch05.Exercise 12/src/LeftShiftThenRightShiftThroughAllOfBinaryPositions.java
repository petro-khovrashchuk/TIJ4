/**
 * Exercise 12: (3) Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift
 * operator to right shift through all of its binary positions, each time displaying the result using
 * Integer.toBinaryString( ).
 *
 * Created by Petro Khovrashchuk on 13/12/2015.
 */

public class LeftShiftThenRightShiftThroughAllOfBinaryPositions {
    static int number = 0xffffffff;

    static int  leftShiftAndPrint(int numb, int numbOfShifts) {
        numb <<= numbOfShifts;
        System.out.println(Integer.toBinaryString(numb));
        return numb;
    }
    static int unsignedRightShiftAndPrint(int numb, int numbOfShifts) {
        numb >>>= numbOfShifts;
        System.out.println(Integer.toBinaryString(numb));
        return numb;
    }

    public static void main (String[] args) {
        System.out.println(Integer.toBinaryString(number));
        number = leftShiftAndPrint(number, 1);
        for (int i = 0; i <= 31; i++) {
            number = unsignedRightShiftAndPrint(number, 1);
        }
    }
}
