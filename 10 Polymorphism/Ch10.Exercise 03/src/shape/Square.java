//:Polymorphism Ex.03
package shape;

/**
 * Created by Petro Khovrashchuk on 20/03/2016.
 */

import static net.mindview.util.Print.print;

public class Square extends Shape {
    @Override
    public void draw() { System.out.println("Square.draw()"); }
    @Override
    public void erase() { System.out.println("Square.erase()"); }
    @Override
    public void print() { System.out.println("Square is printing a message."); }
}
