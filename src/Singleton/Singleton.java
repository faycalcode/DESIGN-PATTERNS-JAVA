package Singleton;

public class Singleton {

    private static Singleton instance;
    private String s;

    private Singleton(String s){
        this.s = s;
    }

    public static Singleton getInstance(String s) {

        if(instance == null){
            instance = new Singleton(s);
        }
        return instance;
    }

    @Override
    public String toString() {
        return s;
    }
}