package Decorator;

public class ArmureDecorator extends Decorator{
    private Float speed;
    private Float weight;

    public ArmureDecorator(View target, Float s, Float w){
        super(target);
        speed = s;
        weight = w;
    }

    @Override
    public void draw(){
        reference.draw();
        System.out.println("je dessine l'armure du personnage");
    }

    @Override
    public Float getSpeed(){
        return reference.getSpeed() - speed; //une armure nous fait tj perdre de la vitesse
    }

    public Float getWeight(){
        return reference.getWeight() + weight;
    }

    @Override
    public void attack(){
    }
}
