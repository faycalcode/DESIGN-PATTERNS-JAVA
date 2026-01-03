package Bibliotheque;

public class MyMain {
    public static void main(String[] args){
        Livre l1 = new Livre("C++",1);
        Livre l2 = new Livre("Java", 2);
        Livre l3 = new Livre("ML", 3);

        Etudiant etudiant1 = new Etudiant("Alice", l1);
        Etudiant etudiant2 = new Etudiant("Bob", l1);
        Etudiant etudiant3 = new Etudiant("Charlie", l2);
        Etudiant etudiant4 = new Etudiant("David", l3);
        Etudiant etudiant5 = new Etudiant("Eve", l3);
        Etudiant etudiant6 = new Etudiant("Faycal", l1);
        Etudiant etudiant7 = new Etudiant("Polo", l2);

        Thread t1 = new Thread(etudiant1);
        Thread t2 = new Thread(etudiant2);
        Thread t3 = new Thread(etudiant3);
        Thread t4 = new Thread(etudiant4);
        Thread t5 = new Thread(etudiant5);
        Thread t6 = new Thread(etudiant6);
        Thread t7 = new Thread(etudiant7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
        }
        catch (InterruptedException e){}
    }
}
