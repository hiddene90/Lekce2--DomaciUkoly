package com.engeto.hotel;



public class Guest {
     String firstName;
     String lastname;
     String dateOfBirth;

    public Guest(String firstName, String lastname, String dateOfBorn) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBorn;
    }
    ///region
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    ///endregion
    public void getDescription(){
        System.out.println("Jméno hosta: "+firstName+" "+lastname+"\n"+"Datum narození: "+dateOfBirth);
    }
}
