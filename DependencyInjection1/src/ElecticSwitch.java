public class ElecticSwitch implements Switch{
    private boolean isOn;
    private Switchable client;

    public ElecticSwitch(Switchable client){
        this.client = client;
        this.isOn = false;
    }

    public Switchable getClient(){
        return this.client;
    }
    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void press() {
        if (this.isOn()){
            this.client.turnOff();
            this.isOn = false;
        }
        else{
            this.client.turnOn();
            this.isOn = true;
        }
    }
}
