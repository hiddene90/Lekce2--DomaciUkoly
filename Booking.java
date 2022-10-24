package com.engeto.hotel;


import java.util.ArrayList;
import java.util.List;

public class Booking {
    Room room;
    Guest guest;
    List<Guest> otherGuests;
    String bookedFrom;
    String bookedTill;
    String typeOfVacation;

    public Booking(Room room, Guest guest, String bookedFrom, String bookedTill, String typeOfVacation) {
        this.room = room;
        this.guest = guest;
        this.bookedFrom = bookedFrom;
        this.bookedTill = bookedTill;
        this.typeOfVacation = typeOfVacation;
    }
    public Booking(Room room, List<Guest> otherGuests,String bookedFrom, String bookedTill, String typeOfVacation){
        this.room = room;
        this.guest = guest;
        this.bookedFrom = bookedFrom;
        this.bookedTill = bookedTill;
        this.typeOfVacation = typeOfVacation;
        this.otherGuests = otherGuests;
    }
    ///region
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(String bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public String getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(String bookedTill) {
        this.bookedTill = bookedTill;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
    ///endregion

    public void getDescription() {

        System.out.println("Rezervace pokoje číslo: " + getRoom().getRoomNum());
        if (this.guest != null) {
            System.out.println("Host: " + guest.firstName + " " + guest.lastname + "\nOd: " + bookedFrom + "\nDo: " + bookedTill);
        }else {
            System.out.println("Hosté: ");
            for (Guest guestInList : otherGuests) {
                System.out.print(guestInList.firstName +" "+ guestInList.lastname +" ");
            }
            System.out.println("\nOd: " + bookedFrom + "\nDo: " + bookedTill);
        }
    }
}


