package Exam2025;

import java.util.ArrayList;
import java.util.List;

public class Pot {
    private List<MeatBall> meatballs;
    public Pot(){
        this.meatballs = new ArrayList<>();
        for(int i=0;i<Math.random()*100;i++){
            meatballs.add(new MeatBall());
        }
    }

    /// tant que le pot est vide on dors,
    /// sinon on prend une meatball du pot au hasard et on la supprime du pot
    synchronized public MeatBall pick() throws InterruptedException{
        while(meatballs.isEmpty()){
            wait();
        }
        int random = (int)(Math.random()*meatballs.size());
        MeatBall m = meatballs.get(random);
        meatballs.remove(random);
        return m;
    }

    /// desqu'on ajoute un meatball dans le pot on notifyAll
    synchronized public void add(MeatBall m){
        meatballs.add(m);
        notifyAll();
    }
}
