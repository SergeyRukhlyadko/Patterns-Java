package structural.proxy;

class CommandLineHandlerImpl implements CommandLineHandler {

    @Override
    public void handle(String... args) {
        System.out.println("Parse input text...");
    }
}
