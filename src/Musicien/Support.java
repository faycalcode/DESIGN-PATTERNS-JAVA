package Musicien;

import java.util.ArrayList;
import java.util.List;

public class Support {
    private List<Partition> partitions;

    public Support(int numberOfPartitions){
        this.partitions = new ArrayList<>();
        for(int i=0; i<numberOfPartitions; i++){
            partitions.add(new Partition());
        }
    }

    synchronized public Partition pickOne() throws InterruptedException{
        while(partitions.isEmpty()){
            wait();
        }
        int random = (int)(Math.random() * partitions.size());
        Partition p = partitions.get(random);
        partitions.remove(random);
        return p;
    }

    synchronized public void addOne(Partition p){
        partitions.add(p);
        notifyAll();
    }
}