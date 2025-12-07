package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Room implements Prototype{
    private Integer idRoom;
    private Integer size;
    private List<Wall> walls = new ArrayList<>();

    public Room(){}

    public Room setIdRoom(Integer i){
        this.idRoom = i;
        return this;
    }

    public Room setSize(Integer size){
        this.size = size;
        return this;
    }

    public Room addWall(Wall w){
        walls.add(w);
        return this;
    }

    public Prototype clone(){
        Room newRoom = new Room().setSize(this.size);
        for(Wall w: this.walls) {
            newRoom.addWall(w);
        }
        return (Prototype) newRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idRoom=" + idRoom +
                ", size=" + size +
                ", walls=" + walls +
                '}';
    }
}