package AbstractFactory;

public class MacFactory implements GuiFactory{
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
