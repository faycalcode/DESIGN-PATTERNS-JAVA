package DeadLock;

public class Ressource1{
    synchronized public void fait(Ressource2 r2){
        try{
            Thread.sleep(100);
        }
        catch(Exception e) {

        }
        r2.fait(this);
    }
}
