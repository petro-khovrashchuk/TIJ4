import furniture.Table;

/**
 * Exercise 4: (2) Show that protected methods have package access but are not public.
 *
 * Created by Petro Khovrashchuk on 19/02/2016.
 */

class MetalTable extends Table{
    MetalTable() {
        makeTable("metal"); // Line shows that protected methods have access via inheritance.
        //this.typeOfTable();
    }
}

public class TableFactory {
    public static void main(String[] args) {
        MetalTable t999 = new MetalTable();
        //t999.typeOfTable(); /* Uncomment this line to see that even this is an inherited class, it doesn't have access
                              /* from here. It has though in line #12. */
        Table betaBuratino = new Table();
        //betaBuratino.makeTable("derevo"); /* Uncomment this and to see see that protected methods don't have public
                                            /* access. */
    }
}