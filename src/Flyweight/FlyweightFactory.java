package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final static Map<String,Asset> flyweights = new HashMap<>();
    public static Asset getAsset(String key, String t){

        Asset f = flyweights.get(key);
        if(f == null){
            if(t.equals(MyMain.ARBRE))
                f = new Arbre(key);
            else
                f = new Rocher(key);
            flyweights.put(key,f);
        }

        return f;
    }

}
