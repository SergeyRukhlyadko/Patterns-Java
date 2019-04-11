package creational.factory_method;

public class Cafe {

    public static void main(String... args) {
        CoffeeFactory factory = new AmericanoCoffeeFactory();
        Coffee americano = factory.make();
        System.out.println(americano);
    }
}
