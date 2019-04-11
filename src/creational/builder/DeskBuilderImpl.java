package creational.builder;

class DeskBuilderImpl implements DeskBuilder {

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

    Desk getResult() {
        return new Desk(form, legs);
    }
}
