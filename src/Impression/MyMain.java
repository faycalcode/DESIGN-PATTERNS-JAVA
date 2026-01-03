package Impression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMain {
    public static void main(String[] args){
        Imprimante i1 = new Imprimante(1);
        Imprimante i2 = new Imprimante(2);

        List<Integer> documents1 = new ArrayList<>(Arrays.asList(1,5,2,4));
        List<Integer> documents2 = new ArrayList<>(Arrays.asList(3));
        List<Integer> documents3 = new ArrayList<>(Arrays.asList(10,1,1,5,6));
        List<Integer> documents4 = new ArrayList<>(Arrays.asList(1));

        Employer e1 = new Employer(i1,documents1);
        Employer e2 = new Employer(i1,documents1);
        Employer e3 = new Employer(i1,documents4);
        Employer e4 = new Employer(i2,documents2);
        Employer e5 = new Employer(i2,documents3);
        Employer e6 = new Employer(i2,documents1);

        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);
        Thread t4 = new Thread(e4);
        Thread t5 = new Thread(e5);
        Thread t6 = new Thread(e6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
        }
        catch (InterruptedException e){}
        //
    }
}