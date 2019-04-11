package structural.proxy;

class CommandLineHandlerProxy implements CommandLineHandler {

    @Override
    public void handle(String... args) {
        System.out.println("Input text:");
        for(String s : args) {
            System.out.println(s);
        }
        System.out.println();
        new CommandLineHandlerImpl().handle(args);
    }
}
