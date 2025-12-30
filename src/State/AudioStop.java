package State;

public class AudioStop extends AudioStates{
    @Override
    public void play(AudioContext c){
        c.setState(new AudioPlay());
        System.out.println("play à partir de stop");
    }
}
