/**
 * Exercise 2: (1) Create a class containing a float and use it to demonstrate aliasing.
 *
 * Created by Petro Khovrashchuk on 08/11/2015.
 */
import static net.mindview.util.Print.*;

public class AliasingDemonstration {
    float f1 = 0;
    float f2 = 0;
    public static void main (String[] args) {
        AliasingDemonstration a = new AliasingDemonstration();
        AliasingDemonstration b = new AliasingDemonstration();

        print("Default values:\n" +
                "a.f1 = " + a.f1 +" b.f1 = " + b.f1 +"\na.f2 = " + a.f2 + " b.f2 = " + b.f2);

        a.f1 += 2;
        a.f2 += 2;
        b.f1 += 5;
        b.f2 += 5;
        print("After a.f1, a.f2 have been increased by two and b.f1, b.f2 by five:" +
                "\na.f1 = " + a.f1 +" b.f1 = " + b.f1 +"\na.f2 = " + a.f2 + " b.f2 = " + b.f2);

        a = b;
        print("After b has been assigned to a:" +
                "\na.f1 = " + a.f1 +" b.f1 = " + b.f1 +"\na.f2 = " + a.f2 + " b.f2 = " + b.f2);

        a.f1 += 2;
        a.f2 += 2;
        b.f1 += 5;
        b.f2 += 5;
        print("After a.f1, a.f2 have been increased by two and b.f1, b.f2 by five:" +
                "\na.f1 = " + a.f1 +" b.f1 = " + b.f1 +"\na.f2 = " + a.f2 + " b.f2 = " + b.f2);
    }
}
