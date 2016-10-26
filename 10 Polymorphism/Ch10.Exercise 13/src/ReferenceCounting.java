import static net.mindview.util.Print.*;

/**
 * Exercise 13: (3) Add a finalize( ) method to ReferenceCounting.java to verify the termination condition
 * (see the Initialization & Cleanup chapter).
 *
 * Created by Petro Khovrashchuk on 04/08/16.
 */

/* So the deal here is that objects of class Composing include in themselves objects of class Shared ( in the given
 * example only one object of Shared ). In order to dispose object of Shared first one must dispose all objects of
 * composing that have reference to it.
 */

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter ++;
    public Shared() {
        print("Creating " + this);
    }

    public void addRef() { refcount++; }
    protected void dispose() {
        //print (refcount);
        if(--refcount == 0) // prefix operator ( first executes then checks evaluation )
            print("Disposing " + this);
    }
    public String toString() { return "Shared " + id; }

    protected void finalize() {
        //print (refcount);
        print("Trying to finalize " + this);
        if (refcount > 0) { print("Error. " + this + " can't be finalized" ); }
        else { print( this + " has been successfully finalized" ); }
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        print("Disposing " + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }

    protected void finalize() {
        print("Trying finalize " + this + " which includes " + shared);
        shared.finalize();
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared) };

        //System.gc();                // These won't work here, still being a mystery to me why.
        //System.runFinalization();   // Could be 'cause each element in array is storing a value-reference to
                                      // Composing object.

        for(Composing c : composing) {
            c.dispose();
        }

        new Composing(shared);
        new Composing(shared);
        System.gc();                // This one works just fine
        // System.runFinalization();// This one won't
    }
}
