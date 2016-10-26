import java.lang.*;
import static net.mindview.util.Print.print;

/**
 * Exercise 5: (4) Repeat Exercise 10 from the previous chapter, using the ternary operator and a bitwise test to
 * display the ones and zeroes, instead of Integer.toBinaryString( ).
 *
 * Created by Petro Khovrashchuk on 11/01/2016.
 */

public class AllPossibleBitwiseOperators {
    static boolean b = false;

    final short bin0 = 0x0;
    final short bin1 = 0x1;

    String intToBinaryString(int num) {
        boolean t = false;
        String strProc = ""; // String for the conversion within the Method
        String strOut = ""; // String for output converted value to binary from integer

        for (int i = 31; i >= 0; i--) {
            int buf = num >> i;
            strProc += (buf&1)==1 ? "1" : "0";
        }

        for (int i = 0; i <= 31; i++) { /* Current for loop formats output so if it consist of numerous 0's in front
                                         * it's going to clean them, or if number consist only from 0's it's going to
                                         * output only the last one.
                                         */
            if (i == 31 || t)
                strOut += strProc.charAt(i);
            else if ((strProc.charAt(i) == '1') && (i < 31)) {
                t = true;
                strOut += strProc.charAt(i);
            }
            if ((!t) && (i < 31))
                strOut += "";
        }

        return strOut;
    }

    public static void main(String[] args) {
        AllPossibleBitwiseOperators all = new AllPossibleBitwiseOperators();
        print("bit0 = " + all.bin0 +"; bit1 = " + all.bin1 + "\n");

        print("Integer.toBinaryString:");
        print("AND: " + (Integer.toBinaryString(all.bin0 & all.bin1)));
        print("OR: " + (Integer.toBinaryString(all.bin0 | all.bin1)));
        print("XOR: " + (Integer.toBinaryString(all.bin0 ^ all.bin1)));
        print("NOT bin0: " + (Integer.toBinaryString(~all.bin1)) + "\n");

        print("Own method:");
        print("AND: " + (all.intToBinaryString(all.bin0 & all.bin1)));
        print("OR: " + (all.intToBinaryString(all.bin0 | all.bin1)));
        print("XOR: " + (all.intToBinaryString(all.bin0 ^ all.bin1)));
        print("NOT bin0: " + (all.intToBinaryString(~all.bin1)) + "\n");

        print(0xF + " = " + all.intToBinaryString(0xF));
        print(343 + " = " + all.intToBinaryString(343));
        print(0 + " = " + all.intToBinaryString(0));
        print();

        print("Logical NOT on false boolean: " + (!all.b) + "\n");
    }
}