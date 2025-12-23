package Configuration;

import java.util.HashMap;
import java.util.Map;

public abstract class Configuration {
    protected Map<String, ConfigElement> components = new HashMap<>();
    public void configure(){
        assembly();
        for(ConfigElement e : components.values()){
            e.setup();
        }
    }
    public abstract void assembly();
    public void addComponent(String key,ConfigElement e){
        components.put(key, e);
    }

}
