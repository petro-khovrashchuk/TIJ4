//:Access Control Ex.4

import furniture.Table;

/**
 * Exercise 4: (2) Show that protected methods have package access but are not public.
 *
 * Created by Petr on 19/02/2016.
 */

class MetalTable extends Table{
    MetalTable() {
        makeTable("metal"); // Line shows that protected methods have access via inheritance
    }
}

public class TableFactory {
    public static void main(String[] args) {
        MetalTable t999 = new MetalTable();
        //t999.typeOfTable();   /* Uncomment this line to see that even this is inherited class, it doesn't have access
                                /* from here */
        Table betaBuratino = new Table();
        //betaBuratino.makeTable("derevo"); /* Uncomment this and I'll see that protected methods don't
                                            /* have public access */

    }
}
