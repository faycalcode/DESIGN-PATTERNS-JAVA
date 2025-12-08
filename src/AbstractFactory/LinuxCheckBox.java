package AbstractFactory;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class LinuxCheckBox implements CheckBox{
    private String label;
    private Boolean isActive;

    public LinuxCheckBox(String s){
        label = s;
        isActive = false;
    }

    @Override
    public void onCheck(){
        if(isActive == true) isActive = false;
        else isActive = true;
    }

    @Override
    public Boolean isCheck(){
        return isActive;
    }
}
