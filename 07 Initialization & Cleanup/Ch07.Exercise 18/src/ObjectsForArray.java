//:Initialization&Cleanup Ex.17

/**
 * Exercise 18: (1) Complete the previous exercise by creating objects to attach to the array of references.
 *
 * Created by Petr on 16/02/2016.
 */

public class ObjectsForArray {
    ObjectsForArray(String msg) {
        System.out.println(msg);
    }

    public static void main (String[] args) {
        ObjectsForArray[] insArr = new ObjectsForArray[10];
        for (int i = 0; i < insArr.length; i++) {
            insArr[i] = new ObjectsForArray(Integer.toString(i+10));
        }
    }

}