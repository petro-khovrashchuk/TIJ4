//:Reusing Classes Ex.16

/**
 * Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called Frog. Put appropriate methods in
 * the base class. In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
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
    Frog(){ setName("Frog"); }
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.swim();
        frog.breathUnderwater();
        frog.crawl();
        frog.breathOnTheSurface();
    }
}
