package Bibliotheque;

public class Etudiant implements Runnable{
    private String nom;
    private Livre livre;
    public Etudiant(String n, Livre l){
        this.nom = n;
        this.livre = l;
    }
    public void run(){
        try {
            livre.emprunter(3);
        }
        catch (InterruptedException e){}
    }
}
