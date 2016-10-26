import java.util.*;

/**
 * Exercise 4: (3) Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime
 * numbers (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).
 *
 * Created by Petro Khovrashchuk on 09/01/2016.
 */

public class PrimeNumbersDetectingAndPrinting {
    int detectAndPrint(int lBar, int tBar) {
        int count = 0;

        for(int i = lBar; i <= tBar; i++) {
            for(int j = 1; j <= i; j++ ) {
                if ((i%j) == 0) // We're dividing particular number by numbers that are less and itself.
                    count++; // Each time if there's no remainder after division we're increasing counter.
            }
            if (count == 2) /* If value of counter is 2 that mean number without reminder was divided on 1 and itself.
                             * So the number is a Prime one.
                             */
                System.out.println("Number " + i + " is Prime;");
            count = 0;
        }
        System.out.println("\nThat's all, folks!");
        return 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        PrimeNumbersDetectingAndPrinting prime = new PrimeNumbersDetectingAndPrinting();
        int lowBar, topBar;

        lowBar = rand.nextInt(1000);
        topBar = rand.nextInt(1000);
        while(topBar < lowBar) // Picking the range so the top limit would be bigger than the low limit.
            topBar = rand.nextInt(1000);

        prime.detectAndPrint(lowBar, topBar);
    }
}
