//:Polymorphism Ex.05

/**
 * Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels. Modify
 * ride( ) to call wheels( ) and verify that polymorphism works.
 *
 * Created by Petro Khovrashchuk on 06/04/2016.
 */

class Cycle {
    String name;
    int numberOfWeels;
    public String toString() { return name; }
    public int wheels() { return numberOfWeels; }
}

class Unicycle extends Cycle {
    Unicycle() {
        name = "Unicycle";
        numberOfWeels = 1;
    }
}

class Bicycle extends Cycle {
    Bicycle() {
        name = "Bicycle";
        numberOfWeels = 2;
    }
}

class Tricycle extends Cycle {
    Tricycle() {
        name = "Tricycle";
        numberOfWeels = 3;
    }
}

public class Ride{
    public static void ride(Cycle i) {
        if (i.wheels() == 1) { System.out.println( i.name + " has " + i.numberOfWeels + " wheel."); }
        else { System.out.println( i.name + " has " + i.numberOfWeels + " wheels.");}
        System.out.println(i + " is rideable ;)");
    }
    public static void main(String[] args) {
        Cycle cyc = new Cycle();
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();

        ride(cyc);
        ride(uni);
        ride(bi);
        ride(tri);
    }
}
