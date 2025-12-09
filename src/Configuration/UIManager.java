package Configuration;

public class UIManager implements ConfigElement{
    private GraphicsEngine ge;
    @Override
    public void setup(){
        System.out.println("UI setup");
    }

    @Override
    public void turnOn(){
        System.out.println("UI on");
    }

    @Override
    public void turnOff(){
        System.out.println("UI off");
    }

    @Override
    public void reset(){
        System.out.println("UI Reset");
    }

    public void setGraphicsEngine(GraphicsEngine ge){
        this.ge = ge;
        System.out.println("la physique est liée au graphic engine");
    }
}