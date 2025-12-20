package Facade;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String id;

    Utilisateur(String n, String p, String i){
        this.nom = n;
        this.prenom = p;
        this.id = i;
    }

    Boolean isLogged(String id){
        return true;
    }
}