package State;

public class AudioStop extends AudioStates{
    //AudioContext context
    @Override
    public void play(){
        AudioStates play = new AudioPlay();
        play.setContext(context);
        context.setState(play);
        System.out.println("play à partir de stop");
    }
}
