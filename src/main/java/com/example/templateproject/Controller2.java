package com.example.templateproject;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/block/")
@RequiredArgsConstructor
public class Controller2 {

    private final Service service;

    @GetMapping("/one")
    public Entity getOne(){
        return service.getOne();
    }
}
