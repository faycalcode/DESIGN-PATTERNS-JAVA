package Proxy;

public class ProxyVideo implements Video{
    private String filename;
    private Video reference;
    private User user;


    public ProxyVideo(String file, User u){
        filename = file;
        user = u;
    }

    @Override
    public void play(){
        if(!user.isLogged()){
            System.out.println("vous devez vous connecter");
            return;
        }
        if(!user.isPremium()){
            System.out.println("vous n'etes pas premium");
            return;
        }
        if (reference == null) reference = new MP4Video(filename);
        reference.play();
    }

    @Override
    public void preview(){
        if(!user.isLogged()){
            System.out.println("vous devez vous connecter");
            return;
        }
        if(reference == null){
            reference = new MP4Video(filename);
        }
        reference.preview();
    }

    @Override
    public void show(){
        if(reference == null){
            System.out.println("je charge l'image pour le proxy");
        }
        else {
            reference.show();
        }
    }
}
