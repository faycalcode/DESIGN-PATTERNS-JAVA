package Musicien;

import java.util.ArrayList;
import java.util.List;

public class Musicien implements Runnable{
    private List<Partition> partitions;
    private Support left;
    private Support right;

    public Musicien(int numberOfPartitions){
        partitions = new ArrayList<>();
        for(int i=0; i<numberOfPartitions; i++){
            partitions.add(new Partition());
        }
    }

    public void setLeft(Support l){
        this.left = l;
    }

    public void setRight(Support r){
        this.right = r;
    }

    private void play(){
        System.out.println("joue la partition");
    }

    ///  prends toutes les partitions devant lui,
    /// si la partition is not learned -> la met dans le support de droite
    private void learn(){
        while(!partitions.isEmpty()){
            int random = (int) (Math.random()*partitions.size());
            Partition p =partitions.get(random);
            partitions.remove(random);
            if(!p.isLearned()){
                right.addOne(p);
            }
            else{
                play();
            }
        }
        try {
            partitions.add(left.pickOne());
        }
        catch (InterruptedException e){
            System.out.println("something went wrong!");
        }
    }

    @Override
    public void run(){
        while(true){
            learn();
        }
    }
}
