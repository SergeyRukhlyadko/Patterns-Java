package structural.flyweight;

import java.awt.*;

class Application {

    public static void main(String... args)  {
        Forest forest = new Forest();
        forest.plantTree(1, 1, "Green Tree", Color.GREEN);
        forest.putTree();
    }
}
