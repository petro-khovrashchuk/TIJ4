import static net.mindview.util.Print.*;

/**
 * Exercise 8: (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the
 * results.
 *
 * Created by Petro Khovrashchuk on 25/11/2015.
 */

public class HexAndOctalWithLongValues {
    static long l1 = 0xf6f;
    static long l2 = 0727;
    public static void main(String[] args) {
        System.out.println("hex...l1 = " + Long.toBinaryString(l1));
        System.out.println("octal.l2 = " + Long.toBinaryString(l2));

        print("hi" + l1);
    }
}
