package furniture;
//:furniture
//:Access Control Ex.4

/**
 * Exercise 4: (2) Show that protected methods have package access but are not public.
 *
 * Created by Petr on 22/02/2016.
 */

public class Table {
    protected String type;
    protected void makeTable(String inp) {
        type = inp;
        System.out.println("Table was created. Enjoy your " + type + " table.");
    }
    protected void typeOfTable() {
        System.out.println("This is a " + type + " table.");
    }
}
