package AbstractFactory;

public class WindowsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public CheckBox createCheckBox() {
        return null;
    }

    @Override
    public Window createWindow(){
        return null;
    }
}
