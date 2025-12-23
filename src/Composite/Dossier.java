package Composite;

import java.util.ArrayList;
import java.util.List;

//Dossier
public class Dossier extends Component{
    private List<Component> children = new ArrayList<>();
    public Dossier(String n, Integer s){
        super(n,s);
    }

    @Override
    public List<Component> getChildren(){
        return null;
    }

    @Override
    public Integer getSize(){
        Integer size = 0;
        for(Component c:children){
            size += c.getSize();
        }
        return size;
    }

    public void addComponent(Component c){
        children.add(c);
    }

    public void removeComponent(Component c){
        children.remove(c);
    }
}