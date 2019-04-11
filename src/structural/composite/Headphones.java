package structural.composite;

class Headphones implements Subject {

    private Double price = 1.5;

    @Override
    public Double getPrice() {
        return price;
    }
}
