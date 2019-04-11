package structural.composite;

class Box implements Subject {

    private Double price = 1.0;

    @Override
    public Double getPrice() {
        return price;
    }
}
