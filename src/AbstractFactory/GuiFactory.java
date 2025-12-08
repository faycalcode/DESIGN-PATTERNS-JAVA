package AbstractFactory;

public interface GuiFactory {
    public Button createButton(String s);
    public CheckBox createCheckbox(String s);
    public Window createWindow(String t, Integer h, Integer l);
}
