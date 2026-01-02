package BrickSpark;

public class Spark implements Runnable{
    private Wall w;
    public Spark(Wall w){
        this.w = w;
    }
    public void run(){
        w.electifyWall();
    }
}
