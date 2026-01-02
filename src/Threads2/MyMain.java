package Threads2;

public class MyMain {
    public static void main(String[] args){
        Mur m = new Mur();
        Spark s = new Spark(m);
        Brick b = new Brick(m);

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        System.out.println("-------");
    }
}
