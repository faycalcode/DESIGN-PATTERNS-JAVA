package Observer;

import java.util.ArrayList;
import java.util.List;

public class Matrix extends Observed{
    private List<Integer> elements = new ArrayList<>();
    public List<Integer> getState(){
        return elements;
    }

    public void addValue(Integer i){
        elements.add(i);
        notifyObservers();
    }
}
