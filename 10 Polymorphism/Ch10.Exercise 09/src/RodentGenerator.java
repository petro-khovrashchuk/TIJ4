import java.util.Random;

/**
 * Created by Petro Khovrashchuk on 06/06/2016.
 */

public class RodentGenerator {
    public static Rodent generate() {
        switch (new Random().nextInt(3)) {
            case 0: return new Mouse();
            case 1: return new Gerbil();
            case 2: return new Hamster();
        }
        return new Rodent();
    }
}
