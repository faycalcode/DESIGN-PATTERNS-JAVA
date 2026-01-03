package Fontaine;

public class Fontaine {
    private boolean accessible = true;
    private void simule(int i) throws InterruptedException{
        Thread.sleep(i*1000);
    }

    synchronized public void remplir(Employer e, Integer i) throws InterruptedException{
        while(!accessible){
            wait();
        }
        accessible = false;
        System.out.println(e.getName() + " remplis pour : " + i + "sec" );
        simule(i);
        accessible = true;
    }
}
