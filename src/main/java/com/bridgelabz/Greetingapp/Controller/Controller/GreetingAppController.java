package com.bridgelabz.Greetingapp.Controller.Controller;


import com.bridgelabz.Greetingapp.Controller.Model.Greeting;
import com.bridgelabz.Greetingapp.Controller.Model.User;
import com.bridgelabz.Greetingapp.Controller.Service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping
@RestController
public class GreetingAppController {
    // CRUD
    //read
    //creating
    //updating
    //deleting

    private static final String template = "Hello, %s!";

    @Autowired
    private IGreetingService iGreetingService;

    @GetMapping(value = {"/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        User user = new User();
        user.setFirstName(name);
        return iGreetingService.addGreeting(user);
    }

    @PostMapping("/fullName")
    public Greeting sayWow(@RequestBody User user) {
        return iGreetingService.addGreeting(user);
    }

    @GetMapping("/all")
    public List<Greeting> getAll(){
        return iGreetingService.getAll();
    }

    @PutMapping("/editGreeting/{id}")
    public Optional<Greeting> editGreetingById(@PathVariable("id") int id, @RequestParam(value = "name") String name) {
        return iGreetingService.editGreetingById(id, name);
    }

    @DeleteMapping("/delete")
    public void deleteByID(@RequestParam(name = "id") int id) {
        iGreetingService.delete(id);
    }
}
