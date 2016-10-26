package access;//:access
//:Access Control Ex.7

/**
 * Created by Petr on 22/02/2016.
 */

public class Widget {
    public void sayhello() {
        new support().callSupport();
    }
}

class support {
    void callSupport() {
        System.out.println("Widget's saying \"Hello\". P.S. Support does too.");
    }
}
