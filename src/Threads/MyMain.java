package Threads;

public class MyMain {
    public static void main(String[] args){
        Thing th1 = new Thing(10);
        Thing th2 = new Thing(15);

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);

        t1.start();
        t2.start();

        for(int i=0; i<10;i++){
            System.out.println("dans le main");
        }
    }
}
