//:Reusing Classes Ex.17

/**
 * Exercise 17: (1) Modify Exercise 16 so that Frog overrides the method definitions from the base class (provides new
 * definitions using the same method signatures). Note what happens in main( ).
 *
 * Created by Petr on 16/03/2016.
 */

public class Amphibian {
    private String name;
    protected void setName(String name) {this.name = name; }
    void breathUnderwater() { System.out.println(this.name + " is breathing underwater"); }
    void breathOnTheSurface() { System.out.println(this.name + " is breathing on the surface"); }
    void swim() { System.out.println(this.name + " is swimming"); }
    void crawl() { System.out.println(this.name + " is crawling"); }
}

class Frog extends Amphibian {
    @Override
    void breathUnderwater() { System.out.println("Frog is breathing underwater"); }
    @Override
    void breathOnTheSurface() { System.out.println("Frog is breathing on the surface"); }
    @Override
    void swim() { System.out.println("Frog is swimming"); }
    @Override
    void crawl() { System.out.println("Frog is crawling"); }
    public static void main(String[] args) {
        Amphibian frogCreature = new Frog();
        /* because of polymorphism methods of derived class will be called. Even the type of a reference (and/or object)
         * is Amphibian it's referring to a Frog object.
         */
        frogCreature.swim();
        frogCreature.breathUnderwater();
        frogCreature.crawl();
        frogCreature.breathOnTheSurface();
    }
}

