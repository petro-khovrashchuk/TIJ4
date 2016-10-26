package DoggysHouse;
//:DoggysHouse
//:Access Control Ex.5

/**
 * Exercise 5: (2) Create a class with public, private, protected, and package-access fields and method members. Create
 * an object of this class and see what kind of compiler messages you get when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package.
 *
 * Created by Petr on 22/02/2016.
 */

public class Dog {
    public String name = "Scruffy";
    private String character = "playful";
    protected String colour = "grey";
    String size = "medium";

    public void askDogsName() { System.out.println("Name of this dog is Scruffy"); }
    private void checkDogsCharacter() { System.out.println("Character of this dog is playful"); }
    public void checkDogsColour() { System.out.println("Colour of this dog is grey"); }
    void checkDogsSize() { System.out.println("Size of this dog is medium"); }

    public static void main(String[] args) {
        Dog ins = new Dog();

        System.out.println(ins.name);   // public
        System.out.println(ins.character);  // private
        System.out.println(ins.colour); // protected
        System.out.println(ins.size);   // package-access

        System.out.println();

        ins.askDogsName();  // public
        ins.checkDogsCharacter();   // private
        ins.checkDogsColour();  // protected
        ins.checkDogsSize();    // package-access
    }
}


class BeingAtDoggysWithinTheSameFile {
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
