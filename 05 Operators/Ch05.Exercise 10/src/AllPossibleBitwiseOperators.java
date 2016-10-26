import static net.mindview.util.Print.*;

/**
 * Exercise 10: (3) Write a program with two constant values, one with alternating binary ones and zeroes, with a zero
 * in the least-significant digit, and the second, also alternating, with a one in the least-significant digit
 * (hint: It’s easiest to use hexadecimal constants for this). Take these two values and combine them in all possible
 * ways using the bitwise operators, and display the results using Integer.toBinaryString( ).
 *
 * Created by Petro Khovrashchuk on 02/12/2015.
 */

public class AllPossibleBitwiseOperators {
    static boolean b = false; //TODO

    final short bin0 = 0x0;
    final short bin1 = 0x1;

    public static void main(String[] args) {
        AllPossibleBitwiseOperators ALL = new AllPossibleBitwiseOperators();
        print("bin0 = " + ALL.bin0 +"; bin1 = " + ALL.bin1 + "\n");

        print("AND: " + (Integer.toBinaryString(ALL.bin0 & ALL.bin1)) + "\n");
        print("OR: " + (Integer.toBinaryString(ALL.bin0 | ALL.bin1)) + "\n");
        print("XOR: " + (Integer.toBinaryString(ALL.bin0 ^ ALL.bin1)) + "\n");
        print("NOT bin0: " + (Integer.toBinaryString(~ALL.bin1)) + "\n");

        print("Logical NOT on false boolean: " + (!ALL.b) + "\n");
    }
}
