/**
 * Exercise 15: (1) Create a class with a String that is initialized using instance initialization.
 *
 * Created by Petro Khovrashchuk on 15/02/2016.
 */

public class EricCarmen {
    //String fraze = "All by myself";
    String fraze;
    String retFraze() {return "All by myself";};
    {
        fraze = retFraze(); /* Wrong way to do it in life (superfluous method calls will be performed). This one is just
                             * fot instance */
        System.out.print(fraze);
    }
    EricCarmen() {
        System.out.println("\nDon't wanna be");
    }
    EricCarmen(short num) {
        System.out.println("\nAnymore");
    }
    EricCarmen(int num) {
        System.out.println(" ...");
    }

    public static void main(String[] args) {
        EricCarmen whiningMan1 = new EricCarmen();
        EricCarmen whiningMan2 = new EricCarmen((short)1);
        EricCarmen whiningMan3 = new EricCarmen(1);
    }
}
