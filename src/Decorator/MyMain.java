package Decorator;

public class MyMain {
    public static void main(String[] args){

        Personnage p = new Personnage(100f,80f);
        VetementDecorator v = new VetementDecorator(p, 25f, 5f);
        ArmureDecorator a = new ArmureDecorator(v, 50f, 100f);
        ArmeDecorator w = new ArmeDecorator(a, 15f, 25f);
        PouvoirDecorator pow = new PouvoirDecorator(w);
        AbiliteDecorator abi = new AbiliteDecorator(pow);

        abi.attack();

    }
}
