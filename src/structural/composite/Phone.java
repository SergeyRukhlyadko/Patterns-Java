package structural.composite;

class Phone implements Subject {

    private Double price = 2.0;

    @Override
    public Double getPrice() {
        return price;
    }
}
