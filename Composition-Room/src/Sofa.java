public class Sofa extends Furniture{
    private static final int maxSittingPeople = 6;
    private int sittingPeople;
    private boolean isSoft;

    public Sofa(String name, int size, String color, boolean isSoft) {
        super(name, size, color);
        this.isSoft = isSoft;
        this.sittingPeople = 0;
    }

    public void addPeopleOnSofa(int numOfPeople){
        if (sittingPeople + numOfPeople < maxSittingPeople){
            this.sittingPeople += numOfPeople;
            System.out.println("There are currently " + this.sittingPeople + " people sitting on the sofa.");
        }
        else {
            this.sittingPeople = maxSittingPeople;
            System.out.println("Sofa is full!");
        }
    }
}
