public class Printer {
    private int tonerLevel = 0;
    private int numberOfPrintedPages = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }

        this.isDuplex = isDuplex;
    }

    public void fillToner(int level){
        this.tonerLevel += level;
        if (level > 100){
            this.tonerLevel = 100;
            System.out.println("Toner level is full.");
        }
        else {
            System.out.println("Toner level filled to " + this.tonerLevel);
        }
    }

    public void printPage(int pages){
        this.numberOfPrintedPages += pages;
        System.out.println(pages + " pages printed. Total pages -> " + this.numberOfPrintedPages);
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }
}
