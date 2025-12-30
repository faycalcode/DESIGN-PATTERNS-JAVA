package State;

public class AudioPause extends AudioStates{
    @Override
    public void play(AudioContext c){
        c.setState(new AudioPlay());
        System.out.println("play à partir de Pause");

    }
    @Override
    public void stop(AudioContext c){
        c.setState(new AudioStop());
        System.out.println("stop à partor de Pause");
    }
}
