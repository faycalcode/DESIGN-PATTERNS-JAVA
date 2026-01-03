package CompteBancaire;

public class Retrait implements Runnable{
    private Compte c;
    private int somme;
    public Retrait(Compte c, int somme){
        this.c = c;
        this.somme = somme;
    }

    public void run(){
        try{
            c.retrait(somme);
        } catch (InterruptedException e) {

        }
    }
}
