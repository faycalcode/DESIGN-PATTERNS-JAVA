package Cantine;

import java.util.List;

public class Etudiant implements Runnable{
    private String name;
    private Integer temps;
    private List<Table> tables;
    public Etudiant(String n, Integer temps, List<Table> tables){
        this.name = n;
        this.temps = temps;
        this.tables = tables;
    }
    public String getName(){return name;}
    public void run(){

        try{
            boolean aMange = false;
            while(!aMange){
                for(Table t : tables){
                    if(t.isFree()){
                        aMange = true;
                        t.tentative(this,temps);
                        break;
                    }
                }
            }
            if(!aMange) Thread.sleep(100);
        }
        catch (InterruptedException e){

        }

    }
}
