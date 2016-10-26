//:Reusing Classes Ex.20

/**
 * Exercise 20: (1) Show that @Override annotation solves the problem in this section. [Page 187]
 *
 * Created by Petr on 17/03/2016.
 */

public class ParentWithPrivateAndPrivateFinalMethods {
    private void method1() { System.out.println("Parent first method."); }
    private final void method2() { System.out.println("Parent second method."); }
    final void method3() { System.out.println("Parent third method."); }
}

class Child extends ParentWithPrivateAndPrivateFinalMethods{
    //! @Override /* compiler will complain: "Method does not override method from its superclass" which can be used as
                  /* indication that you're creating a method and not overriding */
    private void method1() { System.out.println("Child first method."); }
    //! @Override
    private final void method2() { System.out.println("Child second method."); }
    //! @Override
    //! final void method3() { System.out.println("Parent third method."); } // you can't override parent's final method

    public static void main(String[] args) {
        Child ins = new Child();
        ins.method1();
        ins.method2();
    }
}
