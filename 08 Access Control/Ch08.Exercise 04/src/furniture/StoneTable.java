package furniture;

/**
 * Exercise 4: (2) Show that protected methods have package access but are not public.
 *
 * Created by Petro Khovrashchuk on 22/02/2016.
 */

public class StoneTable {
    public static void main (String[] args) {
        Table ins = new Table();
        ins.makeTable("Stone");
        ins.typeOfTable(); // This line shows that protected methods have package access.
    }
}