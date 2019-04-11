package structural.facade;

class Combo {

    void doCombo() {
        GamePad gamePad = new GamePad();
        gamePad.pressA();
        gamePad.pressDownArrow();
        gamePad.pressDownArrow();
        gamePad.pressC();
    }
}
