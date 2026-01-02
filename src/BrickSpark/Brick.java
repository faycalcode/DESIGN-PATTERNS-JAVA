package BrickSpark;

public class Brick implements Runnable{
    private Wall w;
    public Brick(Wall w){
        this.w = w;
    }
    public void run(){
        w.buildWall();
    }
}
