package structural.proxy;

public class ProxyMusic implements Music {

    private RealMusic realMusic;
    private String musicName;

    public ProxyMusic(String musicName) {
        this.musicName = musicName;
    }

    public void play() {
        if (realMusic == null){
            realMusic = new RealMusic(musicName);
        }
        realMusic.play();
    }


}
