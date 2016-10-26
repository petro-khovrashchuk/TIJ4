import static net.mindview.util.Print.*;

/**
 * Exercise 8: (2) Create a switch statement that prints a message for each case, and put the switch inside a for loop
 * that tries each case. Put a break after each case and test it, then remove the breaks and see what happens.
 *
 * Created by Petro Khovrashchuk on 19/01/2016.
 */

public class ForLoopThatTriesEachCaseOfSwitch {
    static int start(){
        for (int i = 0; i <= 9; i++) {
            print("Iteration " + (i+1) + ":");
            switch (i) { /* apparently cases without brake will print out all statements of other encounted cases until
                            brake. */

                case 0: print("  Zero");
                        //break;
                case 1: print("  One");
                        //break;
                case 2: print("  Two");
                        //break;
                case 3: print("  Three");
                        //break;
                case 4: print("  Four");
                        //break;
                case 5: print("  Five");
                        //break;
                case 6: print("  Six");
                        //break;
                case 7: print("  Seven");
                        //break;
                case 8: print("  Eight");
                        //break;
                case 9: print("  Nine");
                        //break;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        start();
    }
}
