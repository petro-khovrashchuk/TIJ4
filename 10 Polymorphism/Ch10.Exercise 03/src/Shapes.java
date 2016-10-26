//:Polymorphism Ex.03

/**
 * Exercise 3: (1) Add a new method in the base class of Shapes.java that prints a message, but don’t override it in the
 * derived classes. Explain what happens (a). Now override it in one of the derived classes but not the others, and see
 * what happens (b). Finally, override it in all the derived classes (c).
 *
 * a: all derived classes will be using that method cause they're also have it in their interface due to inheritance;
 * b: for objects of that particular class and only for them ( and only in case of that particualar method ) will be
 *    called overrided  method. For all other objects ( and other methods of those objects of particular class ) will be
 *    called base-class methods from Shape.java;
 * c: only methods of derived classes will be called.
 *
 * Created by Petro Khovrashchuk on 20/03/2016.
 */

// Polymorphism in Java.

import shape.RandomShapeGenerator;
import shape.Shape;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for(Shape shp : s) {
            shp.draw();
            shp.print();
            System.out.println();
        }
    }
}