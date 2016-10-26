import java.util.*;
import static net.mindview.util.Print.*;

/**
 * Exercise 4: (2) Write a program that calculates velocity using a constant distance and a constant time.
 *
 * Created by Petro Khovrashchuk on 12/11/2015.
 */

public class VelocityCalculation {
    static int cdist = 25;
    static int ctime = 5;

    public static void main(String[] args) {
        Random rand = new Random();
        int dist;
        int time;
        int veloc;

        if (args[0].equals("constant")) { //TODO Documentation/Description
            dist = cdist;
        }
        else if (args[0].equals("variable")) {
            dist = rand.nextInt(999) + 1;
        }
        else {
            dist = Integer.parseInt(args[0]);
        }
        print ("Dist = " + dist);

        if (args[1].equals("constant")) {
            time = ctime;
        }
        else if (args[1].equals("variable")) {
            time = rand.nextInt(99) + 1;
        }
        else {
            time = Integer.parseInt(args[1]);
        }
        print ("Time = " + time);

        veloc = dist/time;
        print("Velocity = " + veloc);
    }
}

