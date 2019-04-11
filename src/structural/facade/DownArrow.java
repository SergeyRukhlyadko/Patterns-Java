package structural.facade;

class DownArrow implements Button {

    @Override
    public void press() {
        System.out.println("Down arrow pressed");
    }
}
