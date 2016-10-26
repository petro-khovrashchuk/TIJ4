//:Access Control Ex.8

import access.Connection;

/**
 * Exercise 8: (4) Following the form of the example Lunch.java, create a class called ConnectionManager that manages a
 * fixed array of Connection objects. The client programmer must not be able to explicitly create Connection objects,
 * but can only get them via a static method in ConnectionManager. When the ConnectionManager runs out of objects, it
 * returns a null reference. Test the classes in main( ).
 *
 * Created by Petr on 22/02/2016.
 */

 /* I not sure does this code satisfy the problem. I think it does. At least partly. */

public class ConnectionManager { // class that manages the Connections.
    ConnectionManager() {
        System.out.println("ConnectionManager has been created.\n");
        Connection.fillArray(); /* when creates the object of this class automatically creates an array and it's being
                                 * filled */
    }
    Connection manageArray() { /* method goes through array of Connections objects and prints out their id until will
                                * run into null reference. Then prints out message ant returns null. If can't get any
                                * array members - returns null reference*/
        Connection sInst;
        for (sInst = Connection.getMemb(); sInst != null; sInst = Connection.getMemb()) {
            System.out.println(sInst.toString() + " has been managed.");
        }
        if (sInst == null) {
            System.out.println("\nNULL has been reached.");
            return null;
        }
        return null;
    }

    public static void main(String[] args) {
        ConnectionManager manager = new ConnectionManager();
        Connection.getNumbObjectsInArray();
        System.out.println();
        manager.manageArray();
    }
}
