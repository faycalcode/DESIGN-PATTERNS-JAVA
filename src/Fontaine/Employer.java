package Fontaine;

public class Employer implements Runnable{
    private String name;
    private Integer temps;
    private Fontaine f;
    public Employer(String s, Fontaine f, Integer temps){
        this.name = s;
        this.f = f;
        this.temps = temps;
    }
    public String getName(){
        return name;
    }
    public void run(){
        try {
            f.remplir(this, temps);
        }
        catch(InterruptedException i){}
    }
}
