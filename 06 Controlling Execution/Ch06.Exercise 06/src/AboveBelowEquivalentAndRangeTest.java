import static net.mindview.util.Print.*;

/**
 * Exercise 6: (2) Modify the two test( ) methods in the previous two programs so that they take two extra arguments,
 * begin and end, and so that testval is tested to see if it is within the range between (and including) begin and end.
 *
 * Created by Petro Khovrashchuk on 12/01/2016.
 */

public class AboveBelowEquivalentAndRangeTest {
    static int test(int testval, int target, int begin, int end) {
        if(testval > target && ( testval <= end && testval >= begin))
            return +11;
        else if(testval > target && !( testval <= end && testval >= begin))
            return +10;
        else if(testval < target && ( testval <= end && testval >= begin))
            return -11;
        else if(testval < target && !( testval <= end && testval >= begin))
            return -10;
        else if(testval == target && ( testval <= end && testval >= begin))
            return 1; // Match
        else
            return 0;
    }
    public static void main(String[] args) {
        print("+1/-1 means that testval is above/below the target value.\nFollowing 1/0 means that testval is/isn't" +
                " in the the range between (and including) begin and end.\nSingle \"1\"/\"0\" means that testval and" +
                " target value match and testval is/isn't in the range.\n");
        print("Compare 10 to 5, range 2 to 13: " + "\n" + test(10, 5, 2, 13)); //10>5 2<10<13
        print("Compare 10 to 5, range 2 to 7: " + "\n" + test(10, 5, 2, 7)); //10>5 2<10>7
        print("Compare 5 to 10, range 2 to 7: " + "\n" + test(5, 10, 2, 7)); //5<10 2<5<7
        print("Compare 5 to 10, range 6 to 8: " + "\n" + test(5, 10, 6, 8)); //5<10 6>5<8
        print("Compare 5 to 5, range 2 to 7: " + "\n" + test(5, 5 , 2, 7)); //5==5 2<5<7
        print("Compare 5 to 5, range 6 to 7: " + "\n" + test(5, 5 , 6, 7)); //5==5 6>5<7
    }
}
