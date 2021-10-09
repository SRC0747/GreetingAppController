package com.bridgelabz.Greetingapp.Controller.Repository;


import com.bridgelabz.Greetingapp.Controller.Model.Greeting;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GreetingAppRepository extends JpaRepository<Greeting, Integer>{
}
