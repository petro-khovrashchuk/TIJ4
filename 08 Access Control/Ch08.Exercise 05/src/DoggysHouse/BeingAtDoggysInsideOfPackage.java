package DoggysHouse;

/**
 * Exercise 5: (2) Create a class with public, private, protected, and package-access fields and method members. Create
 * an object of this class and see what kind of compiler messages you get when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package.
 *
 * Created by Petro Khovrashchuk on 22/02/2016.
 */

public class BeingAtDoggysInsideOfPackage {
    public static void main(String[] args) {
        Dog ins = new Dog();

        System.out.println(ins.name);   // public
        //! System.out.println(ins.character);  // private
        System.out.println(ins.colour); // protected
        System.out.println(ins.size);   // package-access

        System.out.println();

        ins.askDogsName();  // public
        //! ins.checkDogsCharacter();   // private
        ins.checkDogsColour();  // protected
        ins.checkDogsSize();    // package-access
    }
}