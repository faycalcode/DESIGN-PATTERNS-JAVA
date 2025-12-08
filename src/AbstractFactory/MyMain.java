package AbstractFactory;

public class MyMain {
    public static void main(String [] Argv){

        //GuiFactory f = new GuiMacFactory();
        GuiFactory f = new GuiLinuxFactory();

        Button b = f.createButton("Mon button");
        CheckBox c = f.createCheckbox("Mon checkbox");
        Window w = f.createWindow("titre", 100, 200);

    }
}
