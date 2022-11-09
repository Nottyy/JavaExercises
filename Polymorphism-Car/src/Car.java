public class Car {
    private int maxSpeed;
    private boolean engine;
    private int wheels;
    private String name;
    private int cylinders;
    private int speed;
    private boolean engineStarted;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getCurrentSpeed() {
        return this.speed;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public Car(String name, int cylinders, int maxSpeed) {
        this.name = name;
        this.cylinders = cylinders;
        this.maxSpeed = maxSpeed;
        this.wheels = 4;
        this.engine = true;
        this.speed = 0;
        this.engineStarted = false;
    }

    public void startEngine() {
        this.engineStarted = true;
        System.out.println(this.name + "'s engine is started.");
    }

    public void accelerate(int speed) {
        int currentSpeed = this.speed + speed;

        if (currentSpeed > 0 && currentSpeed <= this.maxSpeed && this.engineStarted) {
            this.speed = currentSpeed;
            System.out.println(this.name + " accelerated to " + currentSpeed + "km/h.");
        } else {
            System.out.println("Try again!");
        }
    }

    public void brake() {
        this.speed = 0;
        System.out.println(this.name + " stopped.");
    }
}
