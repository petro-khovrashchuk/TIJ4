/**
 * Exercise 7: (1) Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using return
 * instead.
 *
 * Created by Petro Khovrashchuk on 19/01/2016.
 */

public class PrintsValuesFromOneToHundredWithBreak {
        static int countAndPrint(int start, int finish) {
            for(int i = start ;i <= finish; i++) {
                System.out.println(i);
                if(i == 99) {
                    break;
                    //return 0;   /* Uncomment this line and comment previ ous one to try second requirement of the
                                  /* exercise */
                }
            }
            return 1;
        }

        public static void main(String[] args) {
            int from = 1;
            int to = 100;

            countAndPrint(from, to);
        }
}
