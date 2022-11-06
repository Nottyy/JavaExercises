public class Carpet {
    private double cost;

    public double getCost(){
        return this.cost;
    }

    public void setCost(double cost){
        this.cost = cost < 0 ? 0 : cost;
    }

    public Carpet(double cost){
        this.setCost(cost);
    }
}
