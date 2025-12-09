package Configuration;

public class GraphicsEngine implements ConfigElement {
    private PhysicEngine physic;
    private AudioEngine audio;
    private UIManager ui;
    @Override
    public void setup() {
        System.out.println("Setup du Graphic engine");
    }

    @Override
    public void turnOn() {
        System.out.println("On du Graphic engine");
    }

    @Override
    public void turnOff(){
        System.out.println("Off du Graphic engine");
    }

    @Override
    public void reset(){
        System.out.println("Reset du Graphic engine");
    }

    public void setPhysicEngine(PhysicEngine p){
        this.physic = p;
        System.out.println("Le physic engine est lié au graphique engine");
    }

    public void setAudiEngin(AudioEngine a){
        this.audio = a;
        System.out.println("L'audio engine est lié au graphique engine");
    }

    public void setUImanager(UIManager ui){
        this.ui = ui;
        System.out.println("L'ui manager est lié au graphique engine");
    }

}
