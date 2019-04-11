package creational.builder;

class DeskDirector {

    void constructRoundDesk(DeskBuilder builder) {
        builder.setForm(Desk.DeskForm.RHOMBUS);
        builder.setLegs(1);
    }
}
