package structural.bridge;

public class LgTV implements TV{

    public void on() {
        System.out.println("LgTv is ON ");
    }

    public void off() {
        System.out.println("LgTv is OFF");
    }

    public void tuneChannel(int channel) {
        System.out.println("LgTv is tuned to channel " + channel);
    }
}
