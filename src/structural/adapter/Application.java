package structural.adapter;

class Application {

    public static void main(String... args) {
        PrinterAdapter printer = new PrinterAdapter(new Printer());
        printer.print("SomeString");
    }
}
