package State;

public class MyMain {
    public static void main(String[] args){

        AudioContext c = new AudioContext();
        c.setState(new AudioStop());

        c.play(c);
        c.play(c);
        c.pause(c);
        c.stop(c);
        c.pause(c);


    }
}
