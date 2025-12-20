package Facade;

public class MyMain {
    public static void main(String[] args){
        String utilisateur = "1xc36";
        String arrivee = "Bruxelles";
        String depart = "New York";
        String email = "jaipas@mail.com";

        Utilisateur u =  new Utilisateur("Prout", "Prout", "1xc36");
        Vol v = new Vol("1234","Kinshasa", "Paris");
        Email m = new Email("votre vol est enregistré", email);
        if (u.isLogged(utilisateur)){
            if(v.getArrivee() == arrivee && v.getDepart() == depart){
                m.sendEmail();
            }
            else{
                System.out.println("Aucun vol ne correspond a votre demande");
            }
        }
        else{
            System.out.println("Connectez-vous");
        }
    }
}
