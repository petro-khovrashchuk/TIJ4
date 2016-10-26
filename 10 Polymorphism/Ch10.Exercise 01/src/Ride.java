//:Polymorphism Ex.01

/**
 * Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Demonstrate that an instance of
 * each type can be upcast to Cycle via a ride( ) method.
 *
 * Created by Petro Khovrashchuk on 18/03/2016.
 */

class Cycle {
    String name;
    public static void ride(Cycle i) {System.out.println(i + " is rideable ;)");}
    public String toString() { return name; }
}

class Unicycle extends Cycle {
    Unicycle() { name = "Unicycle"; }
}

class Bicycle extends Cycle {
    Bicycle() { name = "Bicycle"; }
}

class Tricycle extends Cycle {
    Tricycle() { name = "Tricycle"; }
}

public class Ride{
    public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();

        Cycle.ride(uni);
        Cycle.ride(bi);
        Cycle.ride(tri);
    }
}
