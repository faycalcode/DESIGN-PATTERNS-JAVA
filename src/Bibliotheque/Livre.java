package Bibliotheque;

public class Livre {
    private String nom;
    private int id;
    private boolean accessible;
    public Livre(String n, int i){
        nom = n;
        id = i;
        accessible = true;
    }

    synchronized public void emprunter(int duree) throws InterruptedException {
        while(!accessible){
            wait();
        }
        accessible = false;
        System.out.println("Livre " + nom + "emprunté");
        Thread.sleep(duree*1000);//lecture
        accessible = true;
        notifyAll();
        System.out.println("Livre " + nom + "rendu");
    }
}
