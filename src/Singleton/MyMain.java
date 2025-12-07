package Singleton;

public class MyMain {
    public static void main(String[] args){

        Singleton myApp = Singleton.getInstance("mon application");
        System.out.println(myApp);
        Singleton.getInstance("mon application 2");
        System.out.println(myApp);

    }
}
