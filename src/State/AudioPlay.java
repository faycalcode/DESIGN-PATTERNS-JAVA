package State;

public class AudioPlay extends AudioStates{
    @Override
    public void pause(AudioContext c){
        c.setState(new AudioPause());
        System.out.println("Pause à partir de play");
    }
    @Override
    public void stop(AudioContext c){
        c.setState(new AudioStop());
        System.out.println("Stop à partir de play");
    }
}
