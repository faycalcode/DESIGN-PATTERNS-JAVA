package AbstractFactory;

public class GuiMacFactory implements GuiFactory{
    @Override
    public Button createButton(String s){
        return new MacButton(s);
    }

    @Override
    public CheckBox createCheckbox(String s){
        return new MacCheckBox(s);
    }

    @Override
    public Window createWindow(String t, Integer h, Integer l){
        return new MacWindow(t,h,l);
    }
}
