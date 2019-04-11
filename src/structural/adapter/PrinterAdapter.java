package structural.adapter;

class PrinterAdapter implements ReportPrinter {

    private Printer printer;

    public PrinterAdapter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String str) {
        printer.print(str);
    }
}
