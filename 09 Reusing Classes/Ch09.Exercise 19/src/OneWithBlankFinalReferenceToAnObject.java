//:Reusing Classes Ex.19

/**
 * Exercise 19: (2) Create a class with a blank final reference to an object. Perform the initialization of the blank
 * final inside all constructors. Demonstrate the guarantee that the final must be initialized before use, and that it
 * cannot be changed once initialized.
 *
 * Created by Petr on 17/03/2016.
 */

class OtherClass{}

public class OneWithBlankFinalReferenceToAnObject {
    OneWithBlankFinalReferenceToAnObject() { ins = new OtherClass(); }
    //! OneWithBlankFinalReferenceToAnObject(int i) { }
    final OtherClass ins;

    void change() {
        //! ins = new OtherClass();
    }

    public static void main(String[] args) {
        OneWithBlankFinalReferenceToAnObject ins = new OneWithBlankFinalReferenceToAnObject();
        //! ins = new OtherClass();
    }
}
