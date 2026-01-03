package Nthread;

public class MyMain {

    public static void main(String[] args) throws InterruptedException {

        MonRunnable r1 = new MonRunnable();
        int N = 12;

        Thread[] t = new Thread[N];
        for(int i = 0 ; i<N; i++){
            t[i] = new Thread(r1);
            t[i].start();
            //
        }

        for(int i=0; i<N; i++){
            t[i].join();
        }
    }
}