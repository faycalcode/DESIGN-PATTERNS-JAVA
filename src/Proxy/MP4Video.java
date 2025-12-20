package Proxy;

public class MP4Video implements Video{
    private String filename;
    public MP4Video(String f){
        filename = f;
        System.out.println("je charge la vidéo source");
    }

    @Override
    public void play(){
        System.out.println("je montre la vidéo youtube source");
    }

    @Override
    public void preview(){
        System.out.println("je montre la vidéo youtube source avec un accès limité");
    }

    @Override
    public void show(){
        System.out.println("je montre l'image de la vidéo");
    }
}
