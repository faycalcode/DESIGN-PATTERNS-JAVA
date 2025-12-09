package Configuration;

public class GameConfiguration extends Configuration{
    @Override
    public void assembly(){
        GraphicsEngine g = (GraphicsEngine)components.get(MyMain.GRAPHIC);
        PhysicEngine p = (PhysicEngine)components.get(MyMain.PHYSIC);
        AudioEngine a = (AudioEngine)components.get(MyMain.AUDIO);
        UIManager ui = (UIManager)components.get(MyMain.UI);

        g.setAudiEngin(a);
        g.setPhysicEngine(p);
        g.setUImanager(ui);
        ui.setGraphicsEngine(g);
    }
}
