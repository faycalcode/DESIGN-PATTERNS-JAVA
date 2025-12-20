package Facade;

public class Email {
    private String text;
    private String dest;

    public Email(String t, String d){
        this.text = t;
        this.dest = d;
    }

    Boolean sendEmail(){
        System.out.println("j'envoie l'email a : " + dest );
        return true;
    }
}