package CompteBancaire;

public class Compte {
    private int montant;
    private String proprietaire;
    public Compte(int m, String p){
        this.montant = m;
        this.proprietaire = p;
    }
    synchronized public void retrait(int somme) throws InterruptedException {
        Thread.sleep(1000);
        while(montant < somme){
            wait();
        }
        montant -= somme;
        System.out.println("r ->" + getMontant());
    }

    synchronized public void depot(int somme) throws InterruptedException {
        Thread.sleep(1000);
        if(somme>0){
            montant +=somme;
            System.out.println("d ->" + getMontant());
            notifyAll();
        }
    }

    public int getMontant(){return montant;}
    public String getProprietaire(){return proprietaire;}

}
