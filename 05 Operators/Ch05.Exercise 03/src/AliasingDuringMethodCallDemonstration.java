import static  net.mindview.util.Print.*;

/**
 * Exercise 3: (1) Create a class containing a float and use it to demonstrate aliasing during method calls.
 *
 * Created by Petro Khovrashchuk on 10/11/2015.
 */

class FloatVariables {
    float a = 1.11F;
    float b = 2.22F;
}
public class AliasingDuringMethodCallDemonstration {
    static void fooa(FloatVariables ob) {
        ob.a = 12.3F;
    }
    static void foob(FloatVariables ob) {
        ob.b = 45.6F;
    }

    public static void main(String[] args) {
        FloatVariables obj = new FloatVariables();
        print("Default values:");
        print("a = " + obj.a + " b = "+obj.b);
        fooa(obj);
        print("Values after aliasing of value a during the method call:");
        print("a = " + obj.a + " b = "+obj.b);
        obj.a += 1;
        print("Values after increasing value a in one:");
        print("a = " + obj.a + " b = "+obj.b);
        foob(obj);
        print("Values after aliasing of value b during the method call:");
        print("a = " + obj.a + " b = "+obj.b);
        obj.b += 1;
        print("Values after increasing value b in one:");
        print("a = " + obj.a + " b = "+obj.b);
        fooa(obj);
        foob(obj);
        print("Values after aliasing both of values during the method call:");
        print("a = " + obj.a + " b = "+obj.b);
    }
}