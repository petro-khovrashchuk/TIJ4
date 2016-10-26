import static net.mindview.util.Print.*;

/**
 * Exercise 3: (1) Create a class with a default constructor (one that takes no arguments) that prints a message. Create
 * an object of this class.
 *
 * Created by Petr on 11/02/2016.
 */

class PrintMessage {
    PrintMessage() { // Default Constructor
        print("I'm a Message.");
    }
}

public class TheOneInWhichCreateObjectOfClassWithDefaultConstructor {
    public static void main(String[] args) {
        PrintMessage idn = new PrintMessage();
    }
}
