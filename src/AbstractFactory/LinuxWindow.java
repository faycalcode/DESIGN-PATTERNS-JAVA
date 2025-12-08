package AbstractFactory;

public class LinuxWindow implements Window{
    private String title;
    private Integer height;
    private Integer length;
    private Boolean isMin;

    public LinuxWindow(String t, Integer h, Integer l){
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
