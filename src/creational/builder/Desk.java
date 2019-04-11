package creational.builder;

class Desk {

    enum DeskForm { SQUARE, ROUND, RHOMBUS }

    private DeskForm form;
    private int legs;

    Desk(DeskForm form, int legs) {
        this.form = form;
        this.legs = legs;
    }
}
