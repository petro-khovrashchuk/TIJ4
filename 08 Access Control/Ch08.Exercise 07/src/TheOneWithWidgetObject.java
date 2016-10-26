//:access
//:Access Control Ex.7

import access.Widget;

/**
 * Exercise 7: (1) Create the library according to the code fragments describing access and Widget. Create a Widget in a
 * class that is not part of the access package.
 *
 * Created by Petr on 22/02/2016.
 */

public class TheOneWithWidgetObject {
    public static void main(String[] args) {
        Widget unit = new Widget();
        unit.sayhello();
    }
}