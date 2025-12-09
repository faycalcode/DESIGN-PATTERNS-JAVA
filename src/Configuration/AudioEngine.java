package Configuration;

public class AudioEngine implements ConfigElement{
    @Override
    public void setup(){
        System.out.println("setup de l'audio");
    }

    @Override
    public void turnOn(){
        System.out.println("l'audio est on");
    }

    @Override
    public void turnOff(){
        System.out.println("l'audio est off");
    }

    @Override
    public void reset(){
        System.out.println("reset de l'audio");
    }
}
