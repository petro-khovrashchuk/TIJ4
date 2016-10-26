import static net.mindview.util.Print.*;

/**
 * Exercise 1: (1) Create a class containing an uninitialized String reference. Demonstrate that this reference is
 * initialized by Java to null.
 *
 * Created by Petro Khovrashchuk on 09/02/2016.
 */

public class ClassContainingUninitializedString {
    static String str; // Uninitialized String reference

    public static void main(String[] args) {
        print("String = " + str);
    }
}
