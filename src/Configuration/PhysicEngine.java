package Configuration;

public class PhysicEngine implements ConfigElement{
    @Override
    public void setup(){
        System.out.println("setup de la physique");
    }

    @Override
    public void turnOn(){
        System.out.println("la physique est on");
    }

    @Override
    public void turnOff(){
        System.out.println("la physique est off");
    }

    @Override
    public void reset(){
        System.out.println("reset de la physique");
    }
}
