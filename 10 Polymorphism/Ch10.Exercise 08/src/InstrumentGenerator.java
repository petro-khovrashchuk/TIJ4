/**
 * Exercise 8: (2) Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.
 *
 * Created by Petro Khowrashchuk on 10/05/2016.
 */

import java.util.*;

class InstrumentGenerator {
    static Instrument generateInstrum() {
        Random rand = new Random();
        switch( rand.nextInt(6) ) {
            case 0: return new Brass();
            case 1: return new Keyboard();
            case 2: return new Piano();
            case 3: return new Stringed();
            case 4: return new Wind();
            case 5: return new Woodwind();
        }
        return new Instrument();
    }
}
