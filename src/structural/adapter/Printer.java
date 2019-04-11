package structural.adapter;

class Printer {

    void print(String... strs) {
        for(String s : strs) {
            printStar(s.length() + 2);
            System.out.println();
            printStar(1);
            System.out.print(s);
            printStar(1);
            System.out.println();
            printStar(s.length() + 2);
            System.out.println();
        }
    }

    private void printStar(int count) {
        for(int i = 0; i < count; i++)
            System.out.print("*");
    }
}
