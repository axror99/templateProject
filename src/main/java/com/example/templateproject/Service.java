package com.example.templateproject;

import java.util.List;

@org.springframework.stereotype.Service

public class Service {

    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Entity> getList() {
        return repository.findAll();
    }

    public Entity getOne() {
        return repository.findByUsername("axror").get();
    }

    public Entity saveOne(Entity entity){
        return repository.save(entity);
    }
}
