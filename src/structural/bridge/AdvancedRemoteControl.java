package structural.bridge;

public class AdvancedRemoteControl extends RemoteControl{

    public AdvancedRemoteControl(TV tv) {
        super(tv);
    }

    public void turnOn(){
        tv.on();
    }

    public void turnOff() {
        tv.off();
    }

    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }
}
