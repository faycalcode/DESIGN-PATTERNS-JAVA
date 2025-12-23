package Composite;

public class MyMain {
    public static void main(String [] args){
        Dossier c1 = new Dossier("dossier racine", 0);
        Dossier c2 = new Dossier("dossier 1", 0);
        Dossier c3 = new Dossier("dossier racine", 0);
        Dossier c4 = new Dossier("dossier 1", 0);

        Fichier t1 = new Fichier("T1", 10);
        Fichier t2 = new Fichier("T2", 15);
        Fichier t3 = new Fichier("T3", 11);
        Fichier t4 = new Fichier("T4", 16);
        Fichier t5 = new Fichier("T5", 21);
        Fichier t6 = new Fichier("T6", 26);

        c1.addComponent(c2);
        c1.addComponent(t4);
        c1.addComponent(t5);

        c2.addComponent(c3);
        c2.addComponent(c4);
        c2.addComponent(t6);

        c3.addComponent(t1);

        c4.addComponent(t2);
        c4.addComponent(t3);

        System.out.println(c1.getSize());
    }
}

