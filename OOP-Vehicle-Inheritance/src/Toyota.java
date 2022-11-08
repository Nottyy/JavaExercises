public class Toyota extends Car {
    private boolean bluetooth;

    public Toyota(int speed, boolean bluetooth) {
        super(speed, 5, 5);
        this.bluetooth = bluetooth;
    }



    public void playMusic(String songName) {
        System.out.println(this.getClassName() + " is playing " + songName + ".mp3");
    }
}
