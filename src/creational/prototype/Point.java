package creational.prototype;

import java.awt.Color;

class Point implements Shape {

    private int x;
    private int y;
    private Color color;

    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    private Point(Point shape) {
        if (shape != null) {
            shape.x = x;
            shape.y = y;
            shape.color = color;
        }
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    Color getColor() {
        return color;
    }

    @Override
    public Shape createPrototype() {
        return new Point(this);
    }
}
