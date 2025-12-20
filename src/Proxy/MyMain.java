package Proxy;

public class MyMain {
    public static void main(String[] args){
        User u1 = new User("log","pass",true);
        User u2 = new User("log2","pass2",false);

        u1.login();
        u2.login();

        Video v1 = new ProxyVideo("youtube.com/1", u1);
        Video v2 = new ProxyVideo("youtube.com/2", u2);

        v1.preview();
        v1.play();

        v2.play();
        v2.preview();
    }
}
