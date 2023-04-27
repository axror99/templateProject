package com.example.templateproject;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/me")
@RequiredArgsConstructor
public class Controller {

    public  final Service service;
    @GetMapping("/list")
    public List<Entity> getList(){
        return service.getList();
    }

    @PostMapping("/save/{id}")
    public Entity getArray(@PathVariable("id") int id){
       Entity entity= new Entity();
       entity.setName(String.valueOf(id));
       return service.saveOne(entity);
    }
}
