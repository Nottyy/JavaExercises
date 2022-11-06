public class Dog extends Animal {

    private int eyes;
    private int tail;

    public Dog(int size, int weight, String name){
        this(size, weight, name, 1,1);
    }
    public Dog(int size, int weight, String name, int eyes, int tail) {
        super(1, 1, size, weight, name);

        this.eyes = eyes;
        this.tail = tail;
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
        super.eat();
    }
}
