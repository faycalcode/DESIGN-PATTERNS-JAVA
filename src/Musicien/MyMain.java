package Musicien;

public class MyMain {
    public static void main(String[] args){
        int n = 50;
        Musicien[] musiciens = new Musicien[n];
        Support[] supports = new Support[n];

        for(int i=0; i<n; i++){
            musiciens[i] = new Musicien((int)(Math.random()*10));
            supports[i] = new Support(0);
        }

        for(int i=0;i<n; i++){
            musiciens[i].setLeft(supports[i]);
            musiciens[i].setRight(supports[(i+1)%n]);
        }

        Thread[] threads = new Thread[n];
        for(int i=0;i<n;i++){
            threads[i] = new Thread(musiciens[i]);
            threads[i].start();
        }

        for(int i=0;i<n;i++){
            try {
                threads[i].join();
            }
            catch (InterruptedException e){
                System.out.println("something went wrong!");
            }
        }
    }
}
