//:Polymorphism Ex.04
package shape;

/**
 * Created by Petro Khovrashchuk on 20/03/2016.
 */

public class Shape {
    String name;
    public void draw() {System.out.println(name + ".draw() method of the parent class");}
    public void erase() {}
    public void print() { System.out.println("Printing a message."); }
}
