package access;
//:access
//:Access Control Ex.8

import java.util.Random;

/**
 * Created by Petr on 24/02/2016.
 */

public class Connection {
    public int id; // public variable to distinguish objects of Connections i.e.each object has its own id
    private static Connection[] arrCon; // array of Connections
    private static int numbObjectsInArray; // number of objects available in array
    private static int makeObjIndex; // index for making objects
    private static int getObjIndex; // index for returning objects from the array
    private static int arrayRange;
    private Connection(int id) { // no possibility to create Connection via constructor outside of this class
        this.id = id;
        System.out.println(toString() + " has been created.");
    }

    /**
     * Method returning references to Connections objects until it their quantity <= of quantity of objects that allowed
     * within the array. If condition is abused returns null-reference.
     */
    public static Connection makeAnObject() { // objects outside this class should be created by this method
        if(makeObjIndex <= numbObjectsInArray) /* I wanted to create array in which usually there was a number of
                                                * objects in array tailed by nulls. But still, a possibility that all of
                                                * the array will be filled by objects was intentionally remained. */
            return new Connection(makeObjIndex++);
        else return null;
    }

    public static void fillArray() { /* creates and fills up an array of Connections by only Connection objects or
                                      * Connection objects tailed by null-references. Also assign value of
                                      * numbObjectsInArray if it hadn't been before*/
        Random rand = new Random();
        if (numbObjectsInArray == 0)
            numbObjectsInArray = rand.nextInt(14)+1;
        arrayRange = numbObjectsInArray + rand.nextInt(5);
        //System.out.println("Range of array = " + arrayRange);
        arrCon = new Connection[arrayRange];
        for(int i = 0; i < arrayRange; i++) {
            arrCon[i] = makeAnObject();
        }
    }

    public static Connection getMemb() { /* returns members of array regardless is it Connection object or just a
                                          * null reference. If array's ran out of members returns null reference, but
                                          * not from array. */
        if (getObjIndex < arrayRange)
            return arrCon[getObjIndex++];
        else
            return null;
    }

    public String toString() {
        return "Connection " + id;
    }

    public static void getNumbObjectsInArray() { /* assign value of numbObjectsInArray it hasn't been before and prints
                                                  * out message with this value. If it has - just prints out the
                                                  * message. */
        if (numbObjectsInArray == 0) {
            Random rand = new Random();
            numbObjectsInArray = rand.nextInt(14) + 1;
        }
        System.out.println("Number of objects available in array = " + numbObjectsInArray);
    }
}
