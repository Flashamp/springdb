package com.example.sprigdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public List<Greeting> findAll(){
        return greetingService.findAll();
    }

    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.findById(id);
    }

    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting){
        return greetingService.save(greeting);
    }
}
