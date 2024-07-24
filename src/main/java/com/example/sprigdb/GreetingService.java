package com.example.sprigdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public List<Greeting> findAll(){
        return greetingRepository.findAll();
    }

    public Greeting findById(Long id){
        return greetingRepository.findById(id).orElse(null);
    }

    public Greeting save(Greeting greeting){
        return greetingRepository.save(greeting);
    }
}
