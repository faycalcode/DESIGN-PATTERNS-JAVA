package DeadLock;

public class MyMain {
    public static void main(String [] args){
        Ressource1 r1 = new Ressource1();
        Ressource2 r2 = new Ressource2();

        Job1 j1 = new Job1(r1,r2);
        Job2 j2 = new Job2(r1,r2);

        Thread t1 = new Thread(j1);
        Thread t2 = new Thread(j2);

        t1.start();
        t2.start();

    }
}
