package Decorator;

public class ArmeDecorator extends Decorator{

    private Float speed;
    private Float weight;

    public ArmeDecorator(View target, Float s, Float w){
        super(target);
        speed = s;
        weight = w;
    }

    @Override
    public void draw(){
        reference.draw();
        System.out.println("je dessine les armes");
    }

    @Override
    public Float getSpeed(){
        return reference.getSpeed() - speed; //des armes nous ralentissent toujours;
    }

    @Override
    public Float getWeight(){
        return reference.getWeight() + weight;
    }

    @Override
    public void attack(){
        System.out.println("j'attaque ma cible");
    }
}