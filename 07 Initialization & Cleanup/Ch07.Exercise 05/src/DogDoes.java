import java.util.*;
import static net.mindview.util.Print.*;

/**
 * Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based
 * on various primitive data types, and print different types of barking, howling, etc., depending on which overloaded
 * version is called. Write a main( ) that calls all the different versions.
 *
 * Created by Petr on 11/02/2016.
 */

class Dog {
    int typeNum; // Variable that defines which Primitive Type bark will be called with
    Random num = new Random();
    Dog() { // Default Constructor which randomly choose value for Variable typeNum;
        typeNum = num.nextInt(6);
        typeDefineAndCallBark(typeNum);
    }
    Dog(int inNum) { // Constructor, argument defines value for Variable typeNum
        typeNum = (inNum - ((inNum/10)*10))%7; // Arithmetic operations are used to produce any value in range [0-6]
        typeDefineAndCallBark(typeNum);
    }

    void typeDefineAndCallBark(int inp) { /* Method that dependently of input value Cast it into particular Primitive
                                           * Type and call Bark with this value */
        //print(typeNum);
        switch (inp) {
            case 0: bark((char) inp); break;
            case 1: bark((byte) inp); break;
            case 2: bark((short) inp); break;
            case 3: bark((int) inp); break;
            case 4: bark((long) inp); break;
            case 5: bark((float) inp); break;
            case 6: bark((double) inp); // Break's not needed because there's no more lines of code in this method
        }
    }

    void bark(char typeNum) { /* Overloaded Method which dependently of which Primitive Type of Argument is called
                               * with printout different message */
        print("barking\n");
    }
    void bark(byte typeNum) {
        print("howling\n");
    }
    void bark(short typeNum) {
        print("whimpering\n");
    }
    void bark(int typeNum) {
        print("growling\n");
    }
    void bark(long typeNum) {
        print("snoring\n");
    }
    void bark(float typeNum) {
        print("munching\n");
    }
    void bark(double typeNum) {
        print("hiccuping\n");
    }

    int goThroughAllStuffThisDogDoes() { /* Method which Call all versions of Method bark except the version it has
                                          * been called within creation of an Object */
        for(int i = 0; i < 7; i++) {
            if (i == typeNum) continue;
            printnb("Scruffy also does "); /* Message should be changed for other Object. Not sure how to implement
                                            * this in code yet */
            typeDefineAndCallBark(i);
        }
        return 1;
    }
}

public class DogDoes {
    public static void main(String[] args) {
        printnb("Fluffy does ");
        Dog fluffy = new Dog(); // Say "Hello" to Fluffy
        printnb("Scruffy does ");
        Dog scruffy = new Dog(44); // Say "Hello" to Scruffy
        print(); // To print blank line
        scruffy.goThroughAllStuffThisDogDoes();
    }
}