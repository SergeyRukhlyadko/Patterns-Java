package behavioral.chain_of_responsibility;

class ThirdClassInChain extends Chain {

    @Override
    boolean check() {
        System.out.println("Third check");
        return checkNext();
    }
}
