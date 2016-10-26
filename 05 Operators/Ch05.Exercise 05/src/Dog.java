import static net.mindview.util.Print.print;

/**
 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says. In main( ), create two dog objects
 * with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). Then display their names and what they say.
 *
 * Created by Petro Khovrashchuk on 14/11/2015.
 */

public class Dog {
    String name;
    String says;
    public static void main(String[] args) {
        Dog obj0 = new Dog();
        Dog obj1 = new Dog();

        obj0.name = "spot";
        obj0.says = "Ruff!";
        obj1.name = "scruffy";
        obj1.says = "Wurf!";

        print("First Dog:\n\tName: " + obj0.name + "\n\tSays: " + obj0.says);
        print("\nSecond Dog:\n\tName: " + obj1.name + "\n\tSays: " + obj1.says);
    }
}
