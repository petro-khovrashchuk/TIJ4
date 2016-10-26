//:Polymorphism Ex.04
package shape;

/**
 * Created by Petro Khovrashchuk on 05/04/2016.
 */

public class Parallelepiped extends  Shape {
    Parallelepiped() {
        name = "Parallelepiped";
    }
    @Override
    public void print() { System.out.println( "Parallelepiped is printing a message.");}
}
