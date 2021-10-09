package com.bridgelabz.Greetingapp.Controller.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greet")
public class Greeting {
    @Id
    private int id;
    private String message;

    public Greeting(String message)
    {
        this.message = message;
    }

    public Greeting(int id, String message)
    {
        this.id = id;
        this.message = message;
    }


    public long getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getmessage()
    {
        return message;
    }
    public void setMessage(String name)
    {
        this.message = name;
    }
}
