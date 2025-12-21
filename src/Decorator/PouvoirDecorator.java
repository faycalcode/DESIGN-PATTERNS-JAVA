package Decorator;

public class PouvoirDecorator extends Decorator{

    public PouvoirDecorator(View target){
        super(target);
    }

    @Override
    public void draw(){
        reference.draw();
        System.out.println("je dessine les pouvoirs");
    }

    @Override
    public Float getSpeed(){
        return reference.getSpeed();
    }

    @Override
    public Float getWeight(){
        return reference.getWeight();
    }

    @Override
    public void attack(){
        System.out.println("je passe l'attaque a ArmeDecorator");
        reference.attack();
    }
}
