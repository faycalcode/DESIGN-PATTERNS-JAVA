package State;

abstract public class AudioStates implements AudioOperations{
    @Override
    public void play(AudioContext c){}
    @Override
    public void pause(AudioContext c){}
    @Override
    public void stop(AudioContext c){}
}
