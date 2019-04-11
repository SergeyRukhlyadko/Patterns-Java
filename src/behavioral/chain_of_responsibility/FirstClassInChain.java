package behavioral.chain_of_responsibility;

class FirstClassInChain extends Chain {

    @Override
    boolean check() {
        System.out.println("First check");
        return checkNext();
    }
}
