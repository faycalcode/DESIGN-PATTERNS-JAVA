package Exam2025;

public class MyMain {
    public static void main(String[] args) throws InterruptedException {
        int number = 99;
        Person[] persons = new Person[number];
        Pot[] pots = new Pot[number];

        for (int i = 0; i < number; i++) {
            persons[i] = new Person();
            pots[i] = new Pot();
        }

        for(int i=0; i<number; i++){
            persons[i].setLeft(pots[i]);
            if(i!=number-1)
                persons[i].setRight(pots[i+1]);
            else
                persons[i].setRight(pots[0]);
        }

        Thread[] threads = new Thread[number];
        for(int i=0; i<number; i++){
            threads[i] = new Thread(persons[i]);
            threads[i].start();
        }

        for(int i=0; i<number; i++){
            threads[i].join();
        }
    }
}
