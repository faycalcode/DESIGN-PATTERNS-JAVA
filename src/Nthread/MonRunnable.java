package Nthread;

public class MonRunnable implements Runnable{
    private void travail(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
    public void run(){
        travail();
    }
}
