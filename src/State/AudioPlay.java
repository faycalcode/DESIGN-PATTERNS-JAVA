package State;

public class AudioPlay extends AudioStates{

    @Override
    public void pause(){
        AudioStates pause = new AudioPause();
        pause.setContext(this.context);
        context.setState(pause);
        System.out.println("Pause à partir de play");
    }
    @Override
    public void stop(){
        AudioStop stop = new AudioStop();
        stop.setContext(this.context);
        context.setState(stop);
        System.out.println("Stop à partir de play");
    }
}
