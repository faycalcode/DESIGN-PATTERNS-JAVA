package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Floor implements Prototype{
    private Integer idFloor;
    private List<Room> rooms = new ArrayList<>();

    public Floor(){}

    public Floor setIdFloor(Integer i){
        this.idFloor = i;
        return this;
    }

    public Floor addRoom(Room r){
        this.rooms.add(r);
        return this;
    }

    public Prototype clone(){
        Floor newFloor = new Floor();
        for(Room r : this.rooms){
            newFloor.addRoom(r);
        }
        return (Prototype) newFloor;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "idFloor=" + idFloor +
                ", rooms=" + rooms +
                '}';
    }
}