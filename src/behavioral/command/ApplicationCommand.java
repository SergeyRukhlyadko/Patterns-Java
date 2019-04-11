package behavioral.command;

class ApplicationCommand {

    public static void main(String... args) {
        new PrintCommand("SomeString").execute();
    }
}
