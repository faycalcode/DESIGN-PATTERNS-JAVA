package Flyweight;

public class MyMain {
    public static final String ARBRE = "arbre";
    public static final String ROCHER = "rocher";

    public static void main(String [] args){
        Arbre a1 = (Arbre)FlyweightFactory.getAsset("monfichierarbre", ARBRE);
        Arbre a2 = (Arbre)FlyweightFactory.getAsset("monfichierarbre",ARBRE);

        Rocher r1 = (Rocher)FlyweightFactory.getAsset("mon rocher 1", ROCHER);
        Rocher r2 = (Rocher)FlyweightFactory.getAsset("mon rocher 2", ROCHER);

        a1.draw(10,10);
        a2.draw(30,30);
        r1.draw(25,25);
        r2.draw(50,50);
    }
}
