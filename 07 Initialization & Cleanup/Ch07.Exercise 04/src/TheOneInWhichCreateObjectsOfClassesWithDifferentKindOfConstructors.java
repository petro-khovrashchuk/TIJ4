import static net.mindview.util.Print.print;

/**
 * Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a String argument and prints it
 * along with your message.
 *
 * Created by Petr on 11/02/2016.
 */

class PrintMessage {
    PrintMessage() { // Default Constructor
        print("I'm a Message.");
    }
    PrintMessage(String instr) { //Added Constructor
        print(instr);
    }
}

public class TheOneInWhichCreateObjectsOfClassesWithDifferentKindOfConstructors {
    public static void main(String[] args) {
        PrintMessage idn1 = new PrintMessage();
        PrintMessage idn2 = new PrintMessage("I'm a Message from input of the Constructor.");
    }
}
