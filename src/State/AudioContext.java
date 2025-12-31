package State;

public class AudioContext implements AudioOperations{
    private AudioStates state;

    public AudioContext(){
        setState(new AudioStop());
        state.setContext(this);
    }

    public void setState(AudioStates s){
        state = s;
    }

    @Override
    public void play(){
        state.play();
    }

    @Override
    public void pause(){
        state.pause();
    }

    @Override
    public void stop(){
        state.stop();
    }
}
