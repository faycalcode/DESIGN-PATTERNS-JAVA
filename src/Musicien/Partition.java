package Musicien;

public class Partition {
    private boolean learned;
    public Partition(){
        this.learned = (Math.random() <0.5);
    }

    public boolean isLearned(){
        return this.learned;
    }
}
