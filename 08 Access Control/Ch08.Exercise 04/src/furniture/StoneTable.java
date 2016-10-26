package furniture;
//:furniture
//:Access Control Ex.4

/**
 * Exercise 4: (2) Show that protected methods have package access but are not public.
 *
 * Created by Petr on 22/02/2016.
 */

public class StoneTable {
    public static void main (String[] args) {
        Table ins = new Table();
        ins.makeTable("Stone");
        ins.typeOfTable();  // Line shows that protected methods have package access
    }
}
