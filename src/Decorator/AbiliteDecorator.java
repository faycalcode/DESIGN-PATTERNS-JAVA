package Decorator;

public class AbiliteDecorator extends Decorator{
    public AbiliteDecorator(View target){
        super(target);
    }

    @Override
    public void draw(){
        reference.draw();
        System.out.println("j'ajoute les abilitées");
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
        System.out.println("je passe l'attaque a Pouvoir");
        reference.attack();
    }
}
