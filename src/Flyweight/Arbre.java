package Flyweight;

public class Arbre implements Asset {
    private String filename;

    public Arbre(String filename){
        this.filename = filename;
        System.out.println("je construit un arbre " + filename);
    }

    @Override
    public void draw(Integer x, Integer y){
        System.out.println("je dessine un arbre ");
    }

    @Override
    public void remove(){
        System.out.println("destruction de l'arbre");
    }

}
