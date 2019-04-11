package creational.builder;

class DeskManual {

    private Desk.DeskForm form;
    private int legs;

    DeskManual(Desk.DeskForm form, int legs) {
        this.form = form;
        this.legs = legs;
    }

    String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDesk manual built:\n")
          .append("Form of desk: ").append(form).append("\n")
          .append("Count of legs:").append(legs).append("\n");
        return sb.toString();
    }
}
