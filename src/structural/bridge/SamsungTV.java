package structural.bridge;

public class SamsungTV implements TV {

    public void on() {
        System.out.println("SamsungTv is ON");
    }

    public void off() {
        System.out.println("SamsungTv is OFF");
    }

    public void tuneChannel(int channel) {
        System.out.println("SamsungTv tuned to channel " + channel);
    }
}
