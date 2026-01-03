package Cantine;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args){
        Table t1 = new Table(1);
        Table t2 = new Table(2);
        Table t3 = new Table(3);
        List<Table> t = new ArrayList<>();
        t.add(t1);
        t.add(t2);
        t.add(t3);
        Etudiant e1 = new Etudiant("Polo",4,t);
        Etudiant e2 = new Etudiant("Fay",2,t);
        Etudiant e3 = new Etudiant("Coco",5,t);
        Etudiant e4 = new Etudiant("Lola",7,t);
        Etudiant e5 = new Etudiant("Mumu",5,t);
        Etudiant e6 = new Etudiant("Pierre",9,t);

        Thread tr1 = new Thread(e1);
        Thread tr2 = new Thread(e2);
        Thread tr3 = new Thread(e3);
        Thread tr4 = new Thread(e4);
        Thread tr5 = new Thread(e5);
        Thread tr6 = new Thread(e6);

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
        tr5.start();
        tr6.start();
        try{
            tr1.join();
            tr2.join();
            tr3.join();
            tr4.join();
            tr5.join();
            tr6.join();
        }
        catch (InterruptedException i){}
    }
}