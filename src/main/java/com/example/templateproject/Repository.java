package com.example.templateproject;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<Entity,Integer> {
    Optional<Entity> findByUsername(String username);
}
