package ProducteurConsomateur;

public class Consomateur implements Runnable{
    public volatile boolean halt;
    private String name;
    private File pipe;

    public Consomateur(String s, File f){
        halt = false;
        this.name = s;
        this.pipe = f;
    }
    public void run(){
        while(!halt || !pipe.isEmpty()){
            String elem = pipe.getProduct();
            System.out.println(name + " consomme : "+ elem);
        }
    }
}
