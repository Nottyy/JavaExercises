public class Lights {
    int numberOfLights;
    int brightness;
    String color;
    boolean areLightsOn;

    public Lights(int numberOfLights, int brightness, String color) {
        this.numberOfLights = numberOfLights;
        this.brightness = brightness;
        this.color = color;
        this.areLightsOn = false;
    }

    public void turnLightsOn() {
        this.areLightsOn = true;
        this.printMsg(true);
    }

    public void turnLightsOff(){
        this.areLightsOn = false;
        this.printMsg(false);
    }

    public void setColor(String color) {
        switch (color) {
            case "red":
                this.color = "red";
            case "yellow":
                this.color = "yellow";
            case "green":
                this.color = "green";
            default:
                this.color = "black";
        }
    }

    private void printMsg(boolean turnedOnOff){
        System.out.println(this.numberOfLights + " " + this.color + " lights are turned "
                + (turnedOnOff == false ? "off." : "on."));
    }
}
