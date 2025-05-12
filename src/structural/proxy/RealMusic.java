package structural.proxy;

public class RealMusic implements Music {

    private String musicName;

    public RealMusic(String musicName) {
        this.musicName = musicName;
        downland();
    }

    public void downland() {
        System.out.println("Downland Music  " + musicName);
    }

    public void play() {
        System.out.println("PLay Music " + musicName);
    }
}
