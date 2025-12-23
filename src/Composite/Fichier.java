package Composite;

import java.util.List;

//fichier
public class Fichier extends Component{

    public Fichier(String n, Integer s){
        super(n,s);

    }
    @Override
    public List<Component> getChildren(){return null;}

    @Override
    public Integer getSize(){return size;}
}
