package AbstractFactory;

public interface GuiFactory {
    Button createButton();
    CheckBox createCheckBox();
    Window createWindow();
}
