public class BMW extends Car{
    public BMW(int maxSpeed) {
        super("BMW", 6, maxSpeed);
    }

    @Override
    public void accelerate(int speed) {
        int currentSpeed = (int)Math.round((this.getCurrentSpeed() + speed) * 1.2);

        if (currentSpeed > 0 && currentSpeed < this.getMaxSpeed() && this.isEngineStarted()){
            this.setSpeed((int)Math.round(currentSpeed * 1.2));
            System.out.println(this.getName() + " accelerated to " + currentSpeed + "km/h with 20% boost.");
        }
        else{
            System.out.println("Try again.");
        }
    }
}
