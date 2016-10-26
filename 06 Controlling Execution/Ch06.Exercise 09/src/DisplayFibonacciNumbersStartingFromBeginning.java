import static net.mindview.util.Print.*;

/**
 * Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each
 * number (from the third on) is the sum of the previous two. Create a method that takes an integer as an argument and
 * displays that many Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci
 * is the name of the class) the output will be: 1, 1, 2, 3, 5.
 *
 * Created by Petro Khovrashchuk on 26/01/2016.
 */

public class DisplayFibonacciNumbersStartingFromBeginning {
    static int pnum; // variable for first term of a sum of the Fibonacci's function
    static int num = 1; // variable for second term of a sum of the Fibonacci's function
    static int res = 0; // variable for result of a sum of the Fibonacci's function
    static int lim = 0;
    boolean firscIter = true;

    int fibonnaci(int limArg) { // argument is a value for upper limit for Fibonacci sequence
        lim = limArg;   // assigning value of the the upper limit for Fibonacci sequence
        fibonnaciInnwork(1);
        return 1;
    }
    int fibonnaciInnwork(int numb){     /* inner method of fibonacci function. Argument is a value of a term that will
                                           be added to the previous value of the sum (previous number of Fibonacci's
                                           sequence). Technically any number can be added, even those not from
                                           Fibonacci's sequence. Method works in Recursion.*/
        pnum = num; // value that was second term in previous iteration becomes first term in current iteration.
        num = numb; // value of the method's argument becomes second term in current iteration.
        if (firscIter) { //if this is first iteration printing out 0 and value of the  method's argument(originally "1")
            print(pnum);
            print(num);
            firscIter = false; // update trigger so we won't repeatedly print out any values.
        }
        res = numb+pnum;
        if (res <= lim) { // checking if result of this iteration exceeds the preset upper limit
            print(res);
            fibonnaciInnwork(res); // recursive call :)
        }
        return 1;
    }
    public static void main(String[] args) {
        DisplayFibonacciNumbersStartingFromBeginning myObj = new DisplayFibonacciNumbersStartingFromBeginning();
        myObj.fibonnaci(Integer.parseInt(args[0]));
    }
}
