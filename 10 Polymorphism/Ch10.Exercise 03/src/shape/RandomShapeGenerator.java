//:Polymorphism Ex.03

// A "factory" that randomly creates shapes.
package shape;

/**
 * Created by Petro Khovrashchuk on 20/03/2016.
 */

import java.util.Random;

public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
