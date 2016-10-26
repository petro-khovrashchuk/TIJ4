import java.util.Random;

/**
 * Exercise 2: (2) Write a program that generates 25 random int values. For each value, use an if-else statement to
 * classify it as greater than, less than, or equal to a second randomly generated value.
 *
 * Created by Petro Khovrashchuk on 09/01/2016.
 */

public class ComparisonOfTheTwentyFiveInts {
    static int[] generatedNumbers= new int[25]; //Array for random numbers from generate()

    static int generate() {
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            generatedNumbers[i] = rand.nextInt(99); //Generate random numbers in range 0-99
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
        generate();

        for(int i = 1; i < 25; i++) {
            System.out.print(i + ": ");
            compareAndPrint(generatedNumbers[i - 1], generatedNumbers[i]);  /* Rising of index and comparison is
                                                                             * going by "leader" (Comparing 1st to
                                                                             * 2nd; 2nd to 3th; 3th to 4th ..)
                                                                             */
        }
    }
}
