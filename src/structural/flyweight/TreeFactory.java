package structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

class TreeFactory {

    private static Map<String, TreeType> treeTypes = new HashMap<>();

    static TreeType getTreeType(String name, Color color) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color);
            treeTypes.put(name, result);
        }
        return result;
    }
}
