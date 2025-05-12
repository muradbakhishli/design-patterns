package structural.proxy;

public class Main {
    public static void main(String[] args) {

        Music music = new ProxyMusic("Blinding Lights");

        System.out.println("First try : ");
        music.play();

        System.out.println("Second try : " );
        music.play();
    }
}
