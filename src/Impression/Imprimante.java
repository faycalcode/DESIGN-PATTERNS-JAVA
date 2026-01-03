package Impression;

import java.util.List;

public class Imprimante {
    private Integer numero;
    private Boolean accessible;
    public Imprimante(Integer i){
        numero = i;
        accessible = true;
    }
    private void print(Integer i) throws InterruptedException{
        Thread.sleep(i*1000);
    }
    synchronized public void imprime(List<Integer> docs) throws InterruptedException{
        while(!accessible){
            wait();
        }
        accessible = false;

        int j = 1;
        for(Integer i : docs){
            System.out.println("Sur l'imprimante " + numero + " imprime le docu " + j + " pour : " + i + "secondes");
            j++;
            print(i);
        }

        accessible = true;
        notifyAll();
    }
}
