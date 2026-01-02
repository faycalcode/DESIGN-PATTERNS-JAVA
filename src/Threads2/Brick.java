package Threads2;

class Brick implements Runnable{
    private Mur mur = null;
    public Brick(Mur mur){
        this.mur = mur;
    }
    public void run(){
        mur.Construire();
    }
}
