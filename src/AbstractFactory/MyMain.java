package AbstractFactory;

public class MyMain {
    public static void main(String [] Argv){

        GuiFactory f = new WindowsFactory();
        Button b = f.createButton();
        Checkbox c = f.createCheckBox();
        Window w =

    }
}
