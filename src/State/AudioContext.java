package State;

public class AudioContext implements AudioOperations{
    private AudioStates current;

    public void setState(AudioStates s){
        current = s;
    }

    @Override
    public void play(AudioContext c){
        current.play(this);
    }

    @Override
    public void pause(AudioContext c){
        current.pause(this);
    }

    @Override
    public void stop(AudioContext c){
        current.stop(this);
    }
}
