/**
 * Exercise 17: (2) Create a class with a constructor that takes a String argument. During construction, print the
 * argument. Create an array of object references to this class, but don’t actually create objects to assign into the
 * array. When you run the program, notice whether the initialization messages from the constructor calls are printed.
 *
 * Created by Petro Khovrashchuk on 16/02/2016.
 */

public class ObjectsForArray {
    ObjectsForArray(String msg) {
        System.out.println(msg);
    }

    public static void main (String[] args) {
        ObjectsForArray[] insArr = new ObjectsForArray[10];
    }
}