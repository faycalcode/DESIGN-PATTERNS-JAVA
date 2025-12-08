package AbstractFactory;

public class MacCheckBox implements CheckBox{
    private String label;
    private Boolean isActive;
    public MacCheckBox(String s){
        this.label = s;
        this.isActive = false;
    }

    @Override
    public void onCheck(){
        if(isActive == true) isActive = false;
        else isActive = true;
    }

    @Override
    public Boolean isCheck(){
        return this.isActive;
    }
}
