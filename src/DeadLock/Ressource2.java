package DeadLock;

public class Ressource2 {
    synchronized public void fait(Ressource1 r1){
        try{
            Thread.sleep(100);
        } catch (Exception e) {
        }
        r1.fait(this);
    }
}
