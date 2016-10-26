//:Polymorphism Ex.04
package shape;

/**
 * Created by Petro Khovrashchuk on 20/03/2016.
 */

import static net.mindview.util.Print.print;

public class Triangle extends Shape {
    @Override
    public void draw() { System.out.println("Triangle.draw()"); }
    @Override
    public void erase() { System.out.println("Triangle.erase()"); }
    @Override
    public void print() { System.out.println("Triangle is printing a message."); }
}
