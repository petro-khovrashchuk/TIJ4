//:Initialization&Cleanup Ex.20

/**
 * Exercise 20: (1) Create a main( ) that uses varargs instead of the ordinary main( ) syntax. Print all the elements in
 * the resulting args array. Test it with various numbers of command-line arguments.
 *
 * Created by Petr on 16/02/2016.
 */

public class VarargsInMain {
    public static void main(String... args) {
        for(String str : args) {
            System.out.println(str);
        }
    }
}
