package Cantine;

public class Table {
    private Integer numero;
    private boolean accessible;
    public Table(Integer n){
        numero = n;
        accessible = true;
    }
    synchronized void tentative(Etudiant e, Integer time) throws InterruptedException{
        while(!accessible){
            wait();
        }
        accessible = false;
        System.out.println(e.getName() + " mange pendant sur table " + numero + " pour " + time + "sec");
        Thread.sleep(time * 1000);
        accessible = true;
        notifyAll();
    }
    boolean isFree(){
        return accessible;
    }

    public Integer getNumero() {
        return numero;
    }
}
