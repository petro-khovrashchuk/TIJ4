import static net.mindview.util.Print.*;

/**
 * Exercise 2: (2) Create a class with a String field that is initialized at the point of definition, and another one
 * that is initialized by the constructor. What is the difference between the two approaches?
 *
 * Created by Petr on 09/02/2016.
 */

public class StringFieldsThatAreInitializedAtDefinitionAndByConstructor {
    String strd = "Initialized at Definition"; // String field which was initialized at Definition
    String strc; /* Need this Object? for transfer field from Constructor (don't know other way to do this and not
                  * sure it's possible...) */

    StringFieldsThatAreInitializedAtDefinitionAndByConstructor() {
        strc = "Initialized by Constructor";    // String field which was initialized by Constructor
        //print(strc);
    }

    public static void main(String[] args) {
        StringFieldsThatAreInitializedAtDefinitionAndByConstructor ind1 =
                new StringFieldsThatAreInitializedAtDefinitionAndByConstructor();
        AnotherStringInitializedByConstructor ind2 =
                new AnotherStringInitializedByConstructor("Also Initialized by Constructor");
        print(ind1.strd);
        print(ind1.strc);
        print(ind2.strc);
    }
}

class AnotherStringInitializedByConstructor {   /* Class in which string field assigned by string which is provided to
                                                 * Constructor */
    String strc;
    AnotherStringInitializedByConstructor(String smString) {
        strc = smString;
    }
}

//TODO what's the difference?