package ProducteurConsomateur;

public class Producteur implements Runnable{
    private String name;
    private File pipe;
    private Integer cpt;
    public Producteur(String n, File f){
        pipe = f;
        name = n;
        cpt = 0;
    }
    public void run(){
        int i = 10;
        while(i>0) {
            pipe.addProduct(name + "-" + cpt);
            cpt++;
            i--;
        }
    }
}
