package com.bridgelabz.Greetingapp.Controller.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    public int id;
    public String firstName;
    public String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.id = 0;
    }
    public User(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        firstName = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String str = (firstName != null) ? firstName + " " : "";
        str += (lastName != null) ? lastName : "";
        return str.trim();
    }
}
