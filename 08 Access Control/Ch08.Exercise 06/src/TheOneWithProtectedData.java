//:Access Control Ex.6

/**
 * Exercise 6: (1) Create a class with protected data. Create a second class in the same file with a method that
 * manipulates the protected data in the first class.
 * 
 * Created by Petr on 22/02/2016.
 */

public class TheOneWithProtectedData {
    protected String secret = "My secret";
    protected void printhi() { System.out.println("Hi");}
}

class TheOneWithMethod {
    public static void main(String[] args) {
        TheOneWithProtectedData ins = new TheOneWithProtectedData();
        System.out.println(ins.secret);
        ins.secret = "Not anymore";
        System.out.println(ins.secret);
        ins.printhi();
    }
}
