import java.util.Random;

/**
 * Exercise 3: (1) Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. It will then run
 * until you interrupt it from the keyboard (typically by pressing Control-C).
 *
 * Created by Petro Khovrashchuk on 09/01/2016.
 */

public class ComparisonOfTheTwentyFiveIntsInInfiniteLoop {
    static int[] generatedNumbers= new int[25]; // Array for random numbers from generate().

    static int generate() {
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            generatedNumbers[i] = rand.nextInt(99); // Generate random numbers in range 0-99.
        }
        return 1;
    }
    static int compareAndPrint(int num1, int num2) {
        if (num1 < num2)
            System.out.println(num1 + " < " + num2);
        else if (num1 == num2)
            System.out.println(num1 + " == " + num2);
        else if (num1 > num2)
            System.out.println(num1 + " > " + num2);

        return 1;
    }

    public static void main(String[] args) {
        int globalI = 1;    // value for iteration counting.
        while (true) {      // Infinite while loop.
            generate();

            for(int i = 1; i < 25; i++) {
                System.out.print(globalI++ + ": "); // somewhat interesting notation
                compareAndPrint(generatedNumbers[i - 1], generatedNumbers[i]);  /* Rising of index and comparison is
                                                                                 * going by "leader" (Comparing 1st to
                                                                                 * 2nd; 2nd to 3th; 3th to 4th ..).
                                                                                 */
            }
        }
    }
}