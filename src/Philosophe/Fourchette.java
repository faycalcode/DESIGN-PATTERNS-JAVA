package Philosophe;

public class Fourchette {
    private int id;
    private boolean taken;
    public Fourchette(int i){
        id = i;
        taken = false;
    }
    public int getId(){
        return id;
    }
    public synchronized void take() throws Exception{
        while(!taken){
            wait();
        }
        taken = true;
        notify();
    }
}
