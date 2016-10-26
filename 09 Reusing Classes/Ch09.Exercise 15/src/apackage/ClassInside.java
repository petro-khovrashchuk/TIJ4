package apackage;
//:Reusing Classes Ex.15


public class ClassInside {
    protected void method() {
        System.out.println("This is a protected method.");
    }
}

class AnotherClassInside {
    public static void main(String[] args) {
        ClassInside ins = new ClassInside();
        ins.method(); /* because method is protected access to it can be performed only via inheritance or within
                      /* the package */
    }
}
