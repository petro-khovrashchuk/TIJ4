import java.util.Random;

/**
 * Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of initialization of the base classes and
 * derived classes. Now add member objects to both the base and derived classes and show the order in which their
 * initialization occurs during construction.
 *
 * Created by Petro on 09/07/2016.
 */

class Tail {
    Tail() { System.out.println("Tail of this creature has been initialized."); }
}
class Muzzle {
    Muzzle() { System.out.println("Muzzle of this creature has been initialized."); }
}

public class Rodent {
    Rodent() { System.out.println(" Creating Rodent."); }
    Tail t = new Tail();
    Muzzle m = new Muzzle();
    String crunch() { return "Rodent is crunching."; }
    String run() { return "Rodent is running."; }
    String makeAHole() { return "Rodent is making a hole."; }

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