package Philosophe;

public class MyMain {
    public static void main(String[] args) throws InterruptedException {

        int nbfourchettes = 5;
        int nbphilosophes = 5;

        Fourchette[] f = new Fourchette[nbfourchettes];
        for(int i=0; i<nbfourchettes; i++){
            f[i] = new Fourchette(i);
        }

        Philosophe[] p = new Philosophe[nbphilosophes];
        for(int i=0; i<nbphilosophes; i++){
            int gauche = (i+4)%5;
            int droite = i;
            p[i] = new Philosophe(i, f[gauche] , f[droite]);
        }

        Thread[] t = new Thread[nbphilosophes];
        for(int i=0; i<nbphilosophes; i++){
            t[i] = new Thread(p[i]);
            t[i].start();
        }

        for(int i=0; i<nbphilosophes; i++){
            t[i].join();
        }
    }
}

