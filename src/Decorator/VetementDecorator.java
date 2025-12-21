package Decorator;

public class VetementDecorator extends Decorator{
    private Float weight;
    private Float speed;
    public VetementDecorator(View target, Float s, Float w){
        super(target);
        weight = w;
        speed = s;
    }

    @Override
    public void draw(){
        reference.draw();
        System.out.println("J'ajoute les vêtements au personnage");
    }

    @Override
    public Float getSpeed() {
        return reference.getSpeed() + speed; //le personnage est plus rapide car il a des chaussures.
    }

    @Override
    public Float getWeight(){
        return reference.getWeight() + weight; //le personnage est d'office plus lourd habillé
    }

    @Override
    public void attack(){
    }
}
