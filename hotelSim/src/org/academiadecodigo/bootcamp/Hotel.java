package org.academiadecodigo.bootcamp;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Hotel {

    private String name;
    private boolean availableRooms = true;
    Room[] rooms;
    Hotel (String name, int maxRooms, int ocpRooms){
        this.name = name;
        rooms = new Room[maxRooms];
        for(int i = 0; i < rooms.length; i++){
            rooms[i] = new Room();
        }
        for (int i = 0; i < ocpRooms; i++){
            rooms[i].setAvailable(false);
        }
    }


    public String getName() {
        return name;
    }


    public Room getAvailableRoom() {
        Room roomAvailable = rooms[0];
            for(Room room : rooms){
                if (room.isAvailable()){
                    roomAvailable = room;
                }
        }
        return roomAvailable;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room checkIn(){
        Room temp = rooms[0];
        if (getAvailableRoom() == rooms[0]) {
            //System.out.println("Sorry, " + name + " doesn't have any available rooms...");
        }
        temp = getAvailableRoom();
        getAvailableRoom().setAvailable(false);
        return temp;
    }

    public void checkOut(Room guestRoom){
        for (int i = rooms.length; i > 0; i--){
            if (rooms[i].isAvailable() == false){
                rooms[i].setAvailable(true);
            }
        }
    }
}
