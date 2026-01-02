package Threads;

public class Thing implements Runnable{

    private Integer i;
    public Thing(Integer j){i=j;}
    public void Job(){
        for(int j=0;j<i;j++) System.out.println(j);
    }

    public void run(){
        Job();
    }
}