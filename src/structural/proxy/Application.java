package structural.proxy;

class Application {

    public static void main(String... args) {
        new CommandLineHandlerProxy().handle("SomeString");
    }
}
