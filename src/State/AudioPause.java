package State;

public class AudioPause extends AudioStates{


    @Override
    public void play(){
        AudioPlay play = new AudioPlay();
        play.setContext(this.context);
        context.setState(play);
        System.out.println("play à partir de Pause");

    }
    @Override
    public void stop(){
        AudioStop stop = new AudioStop();
        stop.setContext(this.context);
        context.setState(stop);
        System.out.println("stop à partor de Pause");
    }
}
