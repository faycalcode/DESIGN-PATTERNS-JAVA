package State;

abstract public class AudioStates implements AudioOperations{
    protected AudioContext context;

    public void setContext(AudioContext c){
        context = c;
    }

    @Override
    public void play(){}
    @Override
    public void pause(){}
    @Override
    public void stop(){}
}
