package behavioral.chain_of_responsibility;

class Application {

    public static void main(String... args) {
        Chain chain = new FirstClassInChain();
        chain.chaining(new SecondClassInChain()).chaining(new ThirdClassInChain());
        chain.check();
    }
}
