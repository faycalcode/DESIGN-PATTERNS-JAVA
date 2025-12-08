package AbstractFactory;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class MacWindow implements Window{
    private String title;
    private Integer height;
    private Integer length;
    private Boolean isMin;

    public MacWindow(String t, Integer h, Integer l){
        title = t;
        height = h;
        length = l;
        isMin = false;
    }

    @Override
    public Boolean isMinimized(){
        return isMin;
    }
}
