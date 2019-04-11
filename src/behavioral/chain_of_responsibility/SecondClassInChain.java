package behavioral.chain_of_responsibility;

class SecondClassInChain extends Chain {

    @Override
    boolean check() {
        System.out.println("Second check");
        return checkNext();
    }
}
