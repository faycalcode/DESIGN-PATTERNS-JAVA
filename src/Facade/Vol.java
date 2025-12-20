package Facade;

public class Vol {
    private String id;
    private String depart;
    private String arrivee;


    Vol(String id, String dep, String arr){
        this.id = id;
        this.depart = dep;
        this.arrivee = arr;
    }

    Boolean isFull(){
        return false;
    }

    String getDepart(){
        return depart;
    }

    String getArrivee(){
        return arrivee;
    }

}