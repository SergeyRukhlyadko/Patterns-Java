package behavioral.command;

class PrintCommand implements Command {

    private String str;

    PrintCommand(String str) {
        this.str = str;
    }

    @Override
    public void execute() {
        System.out.println(str);
    }
}
