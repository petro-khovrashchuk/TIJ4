//:Reusing Classes Ex.6

import static net.mindview.util.Print.*;

/**
 * Exercise 6: (1) Using Chess.java, prove the statements in the previous paragraph. (If you don’t call the base-class
 * constructor in BoardGame( ), the compiler will complain that it can’t find a constructor of the form Game( ). In
 * addition, the call to the base-class constructor must be the first thing you do in the derived-class constructor.
 * (The compiler will remind you if you get it wrong.)
 *
 * Created by Petr on 24/02/2016.
 */
class Game {
    Game(int i) { print("Game constructor"); }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}
public class Chess extends BoardGame {
    Chess() {
        super(11); /* comment this line to see that compiler complains that it can’t find default a constructor of
                   /* the BoardGame class */
        print("Chess constructor");
        //super(11); /* comment previous line and uncomment this one to see that compiler will be complaining that call
                     /* of the base-class must be first thing in the constructor of the derived class. */
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
