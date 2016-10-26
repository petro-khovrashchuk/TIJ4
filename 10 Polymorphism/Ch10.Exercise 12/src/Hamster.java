/**
 * Created by Petro on 09/07/2016.
 */

public class Hamster extends Rodent {
    Hamster() { System.out.println(" Creating Hamster.\n"); }
    Tail t = new Tail();
    Muzzle m = new Muzzle();
    String crunch() { return "Hamster is crunching."; }
    String run() { return "Hamster is running."; }
    String makeAHole() { return "Hamster is making a hole."; }
}
