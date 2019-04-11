package structural.facade;

class GamePad {

    private Button a;
    private Button b;
    private Button c;
    private Button d;
    private Button upArrow;
    private Button downArrow;
    private Button leftArrow;
    private Button rightArrow;

    void pressA() {
        new A().press();
    }

    void pressB() {
        new B().press();
    }

    void pressC() {
        new C().press();
    }

    void pressD() {
        new D().press();
    }

    void pressUpArrow() {
        new UpArrow().press();
    }

    void pressDownArrow() {
        new DownArrow().press();
    }

    void pressLeftArrow() {
        new LeftArrow().press();
    }

    void pressRightArrow() {
        new RightArrow().press();
    }
}
