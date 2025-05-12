package structural.bridge;

public class Main {
    public static void main(String[] args) {

        TV samsung = new SamsungTV();
        RemoteControl remoteControl1 = new AdvancedRemoteControl(samsung);
        remoteControl1.turnOn();
        remoteControl1.setChannel(3);
        remoteControl1.turnOff();

        System.out.println();

        TV lg = new SamsungTV();
        RemoteControl remoteControl2 = new AdvancedRemoteControl(lg);
        remoteControl2.turnOn();
        remoteControl2.setChannel(10);
        remoteControl2.turnOff();


    }
}
