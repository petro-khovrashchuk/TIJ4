import java.util.Random;

/**
 * Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class, provide
 * methods that are common to all Rodents, and override these in the derived classes to perform different behaviors
 * depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of
 * Rodents, and call your base-class methods to see what happens.
 *
 * Created by Petro Khovrashchuk on 06/06/2016.
 */

public class Rodent {
    String crunch() { return "rodent is crunching."; }
    String run() { return "rodent is running."; }
    String makeAHole() { return "rodent is making a hole."; }

    private static void fillArr(Rodent[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RodentGenerator.generate();
        }
    }
    private static void interactWithArr(Rodent[] arr) {
        for (int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i].crunch());
            System.out.println(arr[i].run());
            System.out.println(arr[i].makeAHole());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rodent[] arr = new Rodent[1 + new Random().nextInt(9)];
        Rodent.fillArr(arr);
        Rodent.interactWithArr(arr);
    }

}