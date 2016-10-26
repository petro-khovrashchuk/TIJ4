import static net.mindview.util.Print.print;

/**
 * Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object. Test for comparison
 * using == and equals( ) for all references.
 *
 * Created by Petro Khovrashchuk on 14/11/2015.
 */
//TODO Explanation, Description

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog obj0 = new Dog();
        Dog obj1 = new Dog();
        Dog obj2 = new Dog();

        obj0.name = "spot";
        obj0.says = "Ruff!";
        obj1.name = "scruffy";
        obj1.says = "Wurf!";

        print("First Dog:\n\tName: " + obj0.name + "\n\tSays: " + obj0.says);
        print("\nSecond Dog:\n\tName: " + obj1.name + "\n\tSays: " + obj1.says);

        //obj2 = obj0;
        obj2.name = "spot";
        obj2.says = "Ruff!";

        print("\nThird Dog:\n\tName: " + obj2.name + "\n\tSays: " + obj2.says + "\n");

        print("1st dog's top reference == 2nd dog's top reference: " + (obj0 == obj1));
        print("1st dog's top reference equals() 2nd dog's top reference: " + (obj0.equals(obj1)));
        print("1st dog's name == 2nd dog's name: " + (obj0.name == obj1.name));
        print("1st dog's name equals() 2nd dog's name: " + obj0.name.equals(obj1.name));
        print("1st dog says == 2nd dog says: " + (obj0.says == obj1.says));
        print("1st dog says equals() 2nd dog says: " + obj0.says.equals(obj1.says) + "\n");

        print("2nd dog's top reference == 3rd dog's top reference: " + (obj1 == obj2));
        print("2nd dog's top reference equals() 3rd dog's top reference: " + (obj1.equals(obj2)));
        print("2nd dog's name == 3rd dog's name: " + (obj1.name == obj2.name));
        print("2nd dog's name equals() 3rd dog's name: " + obj1.name.equals(obj2.name));
        print("2nd dog says == 3rd dog says: " + (obj1.says == obj2.says));
        print("2nd dog says equals() 3rd dog says: " + obj1.says.equals(obj2.says) + "\n");

        print("1st dog's top reference == 3rd dog's top reference: " + (obj0 == obj2));
        print("1st dog's top reference equals() 3rd dog's top reference: " + (obj0.equals(obj2)));
        print("1st dog's name == 3rd dog's name: " + (obj0.name == obj2.name));
        print("1st dog's name equals() 3rd dog's name: " + obj0.name.equals(obj2.name));
        print("1st dog says == 3rd dog says: " + (obj0.says == obj2.says));
        print("1st dog says equals() 3rd dog says: " + obj0.says.equals(obj2.says));
    }
}