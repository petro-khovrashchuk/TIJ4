package furniture;

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