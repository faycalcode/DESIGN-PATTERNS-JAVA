package AbstractFactory;

public class GuiLinuxFactory implements GuiFactory{
    @Override
    public Button createButton(String s){
        return new LinuxButton(s);
    }

    @Override
    public CheckBox createCheckbox(String s){
        return new LinuxCheckBox(s);
    }

    @Override
    public Window createWindow(String t, Integer h, Integer l){
        return new LinuxWindow(t,h,l);
    }
}
