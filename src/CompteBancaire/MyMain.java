package CompteBancaire;

public class MyMain {
    public static void main(String[] args){
        Compte c1 = new Compte(100,"Fay");

        Depot d = new Depot(c1, 20);
        Retrait r = new Retrait(c1, 60);
        for(int i=0;i<5;i++){
            Thread t1 = new Thread(d);
            t1.start();
        }

        for(int i=0;i<5;i++){
            Thread t2 = new Thread(r);
            t2.start();
        }

    }
}
