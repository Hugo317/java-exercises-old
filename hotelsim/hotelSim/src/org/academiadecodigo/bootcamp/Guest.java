package org.academiadecodigo.bootcamp;

public class Guest {

    private String name;
    private Boolean isCheckedIn;
    //String currentHotel;
    private Room currentRoom;

    Guest (String name){
        this.name = name;
        isCheckedIn = false;
    }

    Guest (String name, Boolean isCheckedIn){
        this.name = name;
        this.isCheckedIn = isCheckedIn;
    }

    public void checkIn(Hotel hotel){
            if(isCheckedIn == true) {
                System.out.println("You're already checked in at a hotel.");
                return;
            }
        currentRoom = hotel.checkIn();
        isCheckedIn = true;
        System.out.println("You were able to check in at hotel ");
    }

    public void checkOut(){
        currentRoom.setAvailable(false);
        isCheckedIn = false;
        System.out.println("You have successfully checked out of your hotel");
    }
}
