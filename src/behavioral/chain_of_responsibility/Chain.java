package behavioral.chain_of_responsibility;

abstract class Chain {

    private Chain nextChain;

    Chain chaining(Chain next) {
        nextChain = next;
        return nextChain;
    }

    abstract boolean check();

    boolean checkNext() {
        return nextChain == null || nextChain.check();
    }
}
