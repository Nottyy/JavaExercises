public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.setCarpet(carpet);
        this.setFloor(floor);
    }

    public double getTotalCost(){
        return this.getFloor().getArea() * this.getCarpet().getCost();
    }
}
