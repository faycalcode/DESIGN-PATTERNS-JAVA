package Fontaine;

public class MyMain {
    public static void main(String[] args){
        Fontaine f = new Fontaine();

        Employer e1 = new Employer("polo",f,5);
        Employer e2 = new Employer("fay",f,2);
        Employer e3 = new Employer("boulo",f,10);
        Employer e4 = new Employer("toto",f,4);
        Employer e5 = new Employer("coco",f,8);

        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);
        Thread t4 = new Thread(e4);
        Thread t5 = new Thread(e5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }catch (InterruptedException e){

        }
    }
}