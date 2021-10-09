package com.bridgelabz.Greetingapp.Controller.Service;

import com.bridgelabz.Greetingapp.Controller.Model.Greeting;
import com.bridgelabz.Greetingapp.Controller.Model.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    Greeting addGreeting(User user);

    //Optional<Greeting> findById(int id);

    List<Greeting> getAll();

    Optional<Greeting> editGreetingById(int id, String name);

    void delete(int id);
}
