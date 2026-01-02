package ProducteurConsomateur;

public class MyMain {
    public static void main(String[] args) throws InterruptedException {
        File f = new File(10);
        Consomateur c1 = new Consomateur("c1",f);
        Consomateur c2 = new Consomateur("c2",f);
        Producteur p1 = new Producteur("p1", f);
        Producteur p2 = new Producteur("p2", f);
        Producteur p3 = new Producteur("p3", f);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(c1);
        Thread t5 = new Thread(c2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        c1.halt = true;
        c2.halt = true;

    }
}

