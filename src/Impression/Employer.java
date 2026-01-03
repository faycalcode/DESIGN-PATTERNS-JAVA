package Impression;

import java.util.List;

public class Employer implements Runnable{
    //si il n'y a qu'un seul document alors la liste sera un singleton
    //chaque element de la liste contient le temps d'impression du document
    private List<Integer> documents;
    private Imprimante imprimante;
    public Employer(Imprimante imp, List<Integer> docs){
        this.documents = docs;
        this.imprimante = imp;
    }
    public void run(){
        try{
            imprimante.imprime(documents);
        }
        catch(InterruptedException e){}
    }
}
