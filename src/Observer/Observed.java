package Observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observed {
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer o){
        observers.add(o);
    }
    public void detatch(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for (Observer o : observers){
            o.update(this);
        }
    }
}
