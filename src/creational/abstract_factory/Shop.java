package creational.abstract_factory;

public class Shop {

    public static void main(String... args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Sofa sofa = factory.createSofa();
        System.out.println(sofa);
    }
}
