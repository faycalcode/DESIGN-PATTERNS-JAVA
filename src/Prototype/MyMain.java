package Prototype;

public class MyMain {
    public static void main(String[] Args){

        Wall w1 = new Wall().setColor("red").setHeight(200).setLength(300);
        Wall w2 = (Wall)w1.clone();
        Wall w3 = ((Wall)w1.clone()).setLength(400).setColor("blue");
        Wall w4 = (Wall)w3.clone();

        Room r1 = new Room().setIdRoom(1).addWall(w1).addWall(w2).addWall(w3).addWall(w4).setSize(600);
        Room r2 = ((Room)r1.clone()).setIdRoom(2);

        Floor f1 = new Floor().setIdFloor(1).addRoom(r1).addRoom(r2);

        System.out.println(f1);
    }
}