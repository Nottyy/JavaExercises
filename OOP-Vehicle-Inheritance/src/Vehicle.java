public class Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    private String className = this.getClass().getCanonicalName();

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public String getClassName() {
        return this.className;
    }

    public void move() {
        System.out.println(className + " moves with " + this.speed + " km/h.");
    }

    public void increaseSpeed(int speed) {
        if (this.speed + speed > 180) {
            System.out.println(className + " is overspeeding.");
        } else {
            this.speed += speed;
            printSpeed(className, this.speed);
        }
    }

    public void decreaseSpeed(int speed) {
        if (this.speed - speed <= 0) {
            System.out.println(className + "'s speed cannot be less than 0.");
        } else {
            this.speed -= speed;
            printSpeed(className, this.speed);
        }
    }

    public static void printSpeed(String vehicle, int speed) {
        System.out.println(vehicle + "'s speed is " + speed + " km/h.");
    }
}
