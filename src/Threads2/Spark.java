package Threads2;

class Spark implements Runnable{
    private Mur mur = null;
    public Spark(Mur mur){
        this.mur = mur;
    }
    public void run(){
        try{
            mur.Saigner();
        }catch (Exception e){

        }
    }
}