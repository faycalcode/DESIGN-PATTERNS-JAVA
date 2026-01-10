package Exam2025;

import java.util.ArrayList;
import java.util.List;

public class Person implements Runnable{
    private List<MeatBall> assiette;
    private Pot left;
    private Pot right;

    public Person(){
        assiette = new ArrayList<>();
        for(int i=0; i<(Math.random()*100); i++){
            assiette.add(new MeatBall());
        }
    }

    public void setLeft(Pot left) {
        this.left = left;
    }

    public void setRight(Pot right){
        this.right = right;
    }

    private MeatBall pickOne(){
        int random = (int)(Math.random()*assiette.size());
        MeatBall m = assiette.get(random);
        assiette.remove(random);
        return m;
    }

    public void eatPlate(){
        while(!assiette.isEmpty()){
            MeatBall m = pickOne();
            if(!m.isCooked()) right.add(m);
        }
        try{
            MeatBall m = left.pick();
            assiette.add(m);
        }
        catch (Exception e){}

    }

    @Override
    public void run(){
        while(true){
            eatPlate();
        }
    }
}
