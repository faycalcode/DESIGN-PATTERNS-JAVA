package BrickSpark;

// la ressource qui est partagée
public class Wall {
    synchronized public void buildWall(){
        System.out.println("Wall is building");
    }

    synchronized public void electifyWall(){
        System.out.println("Wall is being electrified");
    }
}