//:Reusing Classes Ex.3

/**
 * Exercise 3: (2) Prove the previous sentence. (Even if you don’t create a constructor for Cartoon( ), the compiler
 * will synthesize a default constructor for you that calls the base class constructor.)
 *
 * Created by Petr on 24/02/2016.
 */

public class GrandParentProof {
    GrandParentProof(){ System.out.println("Hi, I'm a GrandParent class."); }
}

class ParentProof extends GrandParentProof{
    ParentProof(){ System.out.println("Hi, I'm a Parent class."); }
}

class InheritorProof extends ParentProof {
    //private InheritorProof(){ System.out.println("Hi, I'm an Inheritor class."); }

    public static void main(String[] args) {
        InheritorProof ins = new InheritorProof();
    }
}
