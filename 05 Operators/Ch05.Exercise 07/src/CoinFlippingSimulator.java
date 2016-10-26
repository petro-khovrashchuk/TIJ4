import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Exercise 7: (3) Write a program that simulates coin-flipping.
 *
 * Created by Petro Khovrashchuk on 19/11/2015.
 */

public class CoinFlippingSimulator {
    Random rand = new Random();
    boolean resBool;
    int resInt;

    void flipABoolCoin() {
        resBool = rand.nextBoolean();
        if (resBool == true) print("Heads");
        else if (resBool == false) print("Tails");
    }
    void flipARealCoin() {
        resInt = rand.nextInt(99);
        if (resInt < 49) print("Heads");
        else if ((49 <= resInt) && (resInt < 98)) print("Tails");
        else if (98 <= resInt) print("Edge");
    }

    public static void main(String[] args) {
        CoinFlippingSimulator inst = new CoinFlippingSimulator();
        int i = 0;
        while (inst.resInt < 98) {
            ++i;
            System.out.print(i + " ");
            inst.flipARealCoin();
        }
        //inst.flipABoolCoin();
    }
}
