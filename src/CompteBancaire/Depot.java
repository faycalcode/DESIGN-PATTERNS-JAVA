package CompteBancaire;

public class Depot implements Runnable {
    private Compte c;
    private int somme;
    public Depot(Compte c, int somme){
        this.c=c;
        this.somme = somme;
    }
    public void run(){
        try {
            c.depot(somme);
        }
        catch(InterruptedException e){}
    }
}