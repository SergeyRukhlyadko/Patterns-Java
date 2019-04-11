package creational.factory_method;

class AmericanoCoffeeFactory extends CoffeeFactory {

    @Override
    Coffee make() {
        return new Americano();
    }
}
