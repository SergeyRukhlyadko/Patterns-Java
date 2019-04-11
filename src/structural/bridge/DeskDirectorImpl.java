package structural.bridge;

class DeskDirectorImpl implements DeskDirector {

    @Override
    public void constructRoundDesk(DeskBuilder builder) {
        builder.setForm(Desk.DeskForm.ROUND);
        builder.setLegs(1);
    }

    @Override
    public void constructRhombusDesk(DeskBuilder builder) {
        builder.setForm(Desk.DeskForm.RHOMBUS);
        builder.setLegs(4);
    }

    @Override
    public void constructSquareDesk(DeskBuilder builder) {
        builder.setForm(Desk.DeskForm.SQUARE);
        builder.setLegs(4);
    }
}
