package structural.facade;

class LeftArrow implements Button {

    @Override
    public void press() {
        System.out.println("Left arrow pressed");
    }
}
