package Philosophe;

public class Philosophe implements Runnable {
    private int id;
    private Fourchette gauche;
    private Fourchette droite;
    public Philosophe(int i, Fourchette g, Fourchette d){
        this.id = i;
        this.gauche = g;
        this.droite = d;
    }
    public int getId(){
        return this.id;
    }

    public void run(){
        if(id%2==0){

        }
    }
}
