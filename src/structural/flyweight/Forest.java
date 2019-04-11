package structural.flyweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Forest {

    private List<Tree> trees = new ArrayList<>();

    void plantTree(int x, int y, String name, Color color) {
        TreeType type = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    void putTree() {
        for(Tree t : trees) t.draw();
    }
}
