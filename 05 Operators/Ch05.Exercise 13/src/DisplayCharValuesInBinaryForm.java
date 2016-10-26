import java.util.Scanner;

/**
 * Exercise 13: (1) Write a method that displays char values in binary form. Demonstrate it using several different
 * characters.
 *
 * Created by Petro Khovrashchuk on 14/12/2015.
 */

public class DisplayCharValuesInBinaryForm {
    public static void dispCharInBinary(char c){
        System.out.println(Integer.toBinaryString(c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Type a symbol to convert:");
            char c = sc.next().charAt(0);
            if (c == '#') {
                System.out.println("Bye-bye");
                break;
            } else {
                dispCharInBinary(c);
            }
        }
    }
}
