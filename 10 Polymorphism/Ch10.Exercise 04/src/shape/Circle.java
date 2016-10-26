//:Polymorphism Ex.04
package shape;

/**
 * Created by Petro Khovrashchuk on 20/03/2016.
 */

//import static net.mindview.util.Print.print;

public class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Circle.draw()"); }
    @Override
    public void erase() { System.out.println("Circle.erase()"); }
    @Override
    public void print()
        { net.mindview.util.Print.print("Circle is printing a message."); }
    //@Override
    //public void print()
        //{ print("Circle is printing a message."); /* should watch out for name clashing ( print() in
                                                    /* "net.mindview.util.Print" and print() in Circle ). Comment
                                                     * preceding method, uncomment this method and import static line to
                                                     * observe the clashing */

}
