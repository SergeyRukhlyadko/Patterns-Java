package structural.flyweight;

import java.awt.*;

class TreeType {

    private String name;
    private Color color;

    TreeType(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    void draw(int x, int y) {
        System.out.println("Tree drawn on x: " + x + " y: " + y);
    }
}
