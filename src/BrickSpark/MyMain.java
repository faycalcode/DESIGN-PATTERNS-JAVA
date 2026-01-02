package BrickSpark;

public class MyMain {
    public static void main(String[] args) {
        Wall w = new Wall();
        Brick b = new Brick(w);
        Spark s = new Spark(w);

        Thread tb = new Thread(b);
        Thread ts = new Thread(s);

        tb.start();
        ts.start();

    }
}
