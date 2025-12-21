package Decorator;

public class Personnage implements View{
    private Float speed;
    private Float weight;

    public Personnage(Float s, Float w){
        speed = s;
        weight = w;
    }
    @Override
    public void draw(){
        System.out.println("je dessine le personnage de base");
    }

    @Override
    public Float getSpeed(){
        return speed;
    }

    @Override
    public Float getWeight(){
        return weight;
    }

    @Override
    public void attack(){
    }
}