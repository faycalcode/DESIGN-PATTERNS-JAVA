package Exam2025;

public class MeatBall {
    private boolean isCooked;
    public MeatBall(){
        this.isCooked = Math.random()<0.5;
    }

    public boolean isCooked(){return this.isCooked;}
}
