public abstract class Player implements IPlayer {
    private String name;
    private int age;

    public Player(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
