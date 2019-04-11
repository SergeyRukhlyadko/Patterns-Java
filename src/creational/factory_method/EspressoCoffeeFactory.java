package creational.factory_method;

class EspressoCoffeeFactory extends CoffeeFactory {

    @Override
    Coffee make() {
        return new Espresso();
    }
}
