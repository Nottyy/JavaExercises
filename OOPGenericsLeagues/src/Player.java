public abstract class Player implements IPlayer {
    private String name;
    private int strength;

    public Player(String name, int strength){
        this.name = name;
        this.strength = strength;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStrength() {
        return strength;
    }
}
