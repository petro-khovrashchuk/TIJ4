/**
 * Created by Petro on 09/07/2016.
 */

public class Mouse extends Rodent {
    Mouse() { System.out.println(" Creating Mouse.\n"); }
    Tail t = new Tail();
    Muzzle m = new Muzzle();
    String crunch() { return "Mouse is crunching."; }
    String run() { return  "Mouse is running."; }
    String makeAHole() { return "Mouse is making a hole."; }
}
