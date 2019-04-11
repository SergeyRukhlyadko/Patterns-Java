package creational.builder;

class DeskManualBuilder implements DeskBuilder {

    private Desk.DeskForm form;
    private int legs;

    @Override
    public void setForm(Desk.DeskForm form) {
        this.form = form;
    }

    @Override
    public void setLegs(int legs) {
        this.legs = legs;
    }

    DeskManual getResult() {
        return new DeskManual(form, legs);
    }
}
