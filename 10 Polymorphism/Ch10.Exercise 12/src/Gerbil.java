/**
 * Created by Petro Khovrashchuk on 09/07/2016.
 */

public class Gerbil extends Rodent {
    Gerbil() { System.out.println(" Creating Gerbil.\n"); }
    Tail t = new Tail();
    Muzzle m = new Muzzle();
    String crunch() { return "Gerbil is crunching."; }
    String run() { return  "Gerbil is running."; }
    String makeAHole() { return "Gerbil is making a hole."; }
}