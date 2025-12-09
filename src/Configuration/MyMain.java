package Configuration;

public class MyMain {
    public static final String GRAPHIC = "Graphic";
    public static final String PHYSIC = "Physic";
    public static final String AUDIO = "Audio";
    public static final String UI = "Ui";

    public static void main(String[] args){
        GraphicsEngine g = new GraphicsEngine();
        PhysicEngine p = new PhysicEngine();
        AudioEngine a = new AudioEngine();
        UIManager ui = new UIManager();

        try{

            GameConfiguration config = new GameConfiguration();
            config.addComponent(GRAPHIC, g);
            config.addComponent(PHYSIC, p);
            config.addComponent(AUDIO, a);
            config.addComponent(UI, ui);

            config.configure();

        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Démarrage sans erreur!");
    }
}
