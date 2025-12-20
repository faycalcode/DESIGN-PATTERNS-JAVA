package Proxy;

public class User {
    private String username;
    private String password;
    private Boolean isLogged = false;
    private Boolean premium = false;

    public User(String u, String p, Boolean isPremium) {
        username = u;
        password = p;
        premium = isPremium;
    }

    public void login(){
        isLogged = true;
    }

    public void logout(){
        isLogged = false;
    }

    public Boolean isLogged(){
        return isLogged;
    }

    public Boolean isPremium(){
        return premium;
    }
}
