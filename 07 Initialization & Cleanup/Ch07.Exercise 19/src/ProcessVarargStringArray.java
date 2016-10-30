/**
 * Exercise 19: (2) Write a method that takes a vararg String array. Verify that you can pass either a comma-separated
 * list of Strings or a String[] into this method.
 *
 * Created by Petro Khovrashchuk on 16/02/2016.
 */

public class ProcessVarargStringArray {
    static void takeVararg(String... args) {
        for(String str: args) {
            System.out.print(str);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] strIns = new String[]{"How","\'re ","you ","doing","?"};
        takeVararg(strIns);
        takeVararg("My ","name ","is Joey.");
    }
}