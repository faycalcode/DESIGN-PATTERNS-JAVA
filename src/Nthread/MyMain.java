package Nthread;

public class MyMain {

    public static void main(String[] args){

        MonRunnable r1 = new MonRunnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();

    }

}
