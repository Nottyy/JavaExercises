public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(10, false);
        printer.fillToner(20);
        printer.printPage(10);
        printer.printPage(2);
        printer.fillToner(50);
    }
}