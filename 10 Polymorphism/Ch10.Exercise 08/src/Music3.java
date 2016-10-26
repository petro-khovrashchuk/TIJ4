//:Polymorphism Ex.07

/**
 * Exercise 8: (2) Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.
 *
 * Created by Petro Khovrashchuk on 10/05/2016.
 */

//import javax.sql.rowset.serial.SerialArray;

import java.util.*;
import static net.mindview.util.Print.*;

class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { print("Adjusting Instrument"); }
}
class Wind extends Instrument {
    void play(Note n) { print("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}
class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}
class Keyboard extends Instrument {
    void play(Note n) { print("Keyboard.play() " + n); }
    public String toString() { return "Keyboard"; }
    void adjust() { print("Adjusting Keyboard"); }
}
class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }
    void adjust() { print("Adjusting Brass"); }
    /* If any of overrides haven't took place - method of the parent class will be called. (In this case parent version
       of method toString() will be called for object of the current class) */
}
class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}
class Piano extends Keyboard {
    void play(Note n) { print("Piano.play() " + n); }
    public String toString() { return  "Piano"; }
    void adjust() { print("Adjusting Piano"); }
}
public class Music3 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void printAll(Instrument[] e) {
        int i = 0;
        for(Instrument ins : e) {
            System.out.print("Instrument " + (i + 1) + " is ");
            System.out.println(ins);
            i++;
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
// Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[ 1 + rand.nextInt(10)];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = InstrumentGenerator.generateInstrum();
        }
        printAll(orchestra);
        System.out.println();
        tuneAll(orchestra);
    }
}