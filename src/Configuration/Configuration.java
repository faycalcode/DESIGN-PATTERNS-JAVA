package Configuration;

import java.util.Map;

public abstract class Configuration {
    protected Map<String, ConfigElement> components = null;
    public void configure(){
        assembly();
        for(ConfigElement e : components.values()){
            e.setup();
        }
    }
    public void assembly(){
        //sera ecrasé dans la class MyConfiguration
    }
    public void addComponent(String key,ConfigElement e){
        components.put(key, e);
    }

}
