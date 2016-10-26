//:Reusing Classes Ex.18

import java.util.Random;

/**
 * Exercise 18: (2) Create a class with a static final field and a final field and demonstrate the difference between
 * the two.
 * 
 * Created by Petr on 17/03/2016.
 */

public class OneWithStaticFinalFieldAndFinalField {
    static Random rand = new Random();

    final String fs = "Final sting"; /* because this is an object final applies to reference, not value. So you'd be
                                      * able to change value if you're not changing the reference. In this case
                                      * reference is pointing on the String constant in memory, you can't change String
                                      * because in Java it's immutable (if you change it - it creates new record in
                                      * memory with new address) and you can't change reference, so you can't change
                                      * String object :) */
    static final String SFS = "Static final string";
    final Integer fri = rand.nextInt(100);
    static final Integer SFRI = rand.nextInt(100);

    public static void main(String[] args) {
        //! OneWithStaticFinalFieldAndFinalField.SFS = "blah"; /* can't change final static field, it would need new
                                                               /* allocation for String. */
        //! OneWithStaticFinalFieldAndFinalField.fs = "blah"; /* can't call non-static field before creation of its
                                                              /* object */
        System.out.println(OneWithStaticFinalFieldAndFinalField.SFS);
        OneWithStaticFinalFieldAndFinalField ins1 = new OneWithStaticFinalFieldAndFinalField();
        //! ins.fs = "blahblah"; // can't change final field, it would need new allocation for String.
        System.out.println(ins1.fs);
        //! ins1.fri++; // same case as with String, Integer is also immutable.
        System.out.println();
        System.out.println("Final int of ins1: " + ins1.fri);
        System.out.println("Static final int of ins1: " + ins1.SFRI);
        OneWithStaticFinalFieldAndFinalField ins2 = new OneWithStaticFinalFieldAndFinalField();
        System.out.println("Final int of ins2: " + ins2.fri);
        System.out.println("Static final int of ins2: " + ins2.SFRI); /* static fields are created before any objects,
                                                                       * that's why this value is same in two objects */
    }
}
