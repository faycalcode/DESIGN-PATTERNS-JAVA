package Flyweight;

public class Rocher implements Asset{
    private String filename;

    public Rocher(String filename){
        this.filename = filename;
        System.out.println("je crée un rocher " + filename);
    }
    @Override
    public void draw(Integer x, Integer y){
        System.out.println("je dessine un rocher");
    }

    @Override
    public void remove(){
        System.out.println("déstruction du rocher");
    }
}
