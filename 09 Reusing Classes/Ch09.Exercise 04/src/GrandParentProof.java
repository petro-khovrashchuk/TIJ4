//:Reusing Classes Ex.4

/**
 * Exercise 4: (2) Prove that the base-class constructors are (a) always called and (b) called before derived-class
 * constructors.
 *
 * Created by Petr on 24/02/2016.
 */

public class GrandParentProof {
    GrandParentProof(){ System.out.println("Hi, I'm a GrandParent class."); }
}

class ParentProof extends GrandParentProof{
    ParentProof(){ System.out.println("Hi, I'm a Parent class."); }
}

class InheritorProof1 extends ParentProof {
    InheritorProof1() {System.out.println("Hi, I'm an Inheritor1 class."); }

    public static void main(String[] args) {
        InheritorProof1 ins = new InheritorProof1();
    }
}

class InheritorProof2 extends ParentProof {
    InheritorProof2() {System.out.println("Hi, I'm an Inheritor2 class."); }

    public static void main(String[] args) {
        new InheritorProof2();
    }
}

class InheritorProof3a extends InheritorProof2 {}
class InheritorProof3b extends InheritorProof3a {
    InheritorProof3b() {System.out.println("Hi, I'm an Inheritor3b class."); }

    public static void main(String[] args) {
        new InheritorProof3b();
    }
}
/* Cool error here, not sure why :)

class InheritorProof4a extends ParentProof {
    //InheritorProof4c insa = new InheritorProof4c();
    InheritorProof4a() {System.out.println("Hi, I'm an Inheritor4a class."); }

    public static void main(String[] args) {
        InheritorProof4a insb = new InheritorProof4a();
    }
}
class InheritorProof4b extends InheritorProof4a {
    InheritorProof4b() {System.out.println("Hi, I'm an Inheritor4b class."); }
}
class InheritorProof4c extends InheritorProof4b {
    InheritorProof4c() {System.out.println("Hi, I'm an Inheritor4c class."); }
}

*/