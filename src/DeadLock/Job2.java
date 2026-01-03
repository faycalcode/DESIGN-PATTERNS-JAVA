package DeadLock;

public class Job2 implements Runnable{
    private Ressource1 r1;
    private Ressource2 r2;

    public Job2(Ressource1 r1, Ressource2 r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    public void run(){
        r2.fait(r1);
    }
}
