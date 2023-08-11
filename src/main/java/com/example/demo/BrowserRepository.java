package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface BrowserRepository extends CrudRepository<Browser, String> {
    Browser findByName(String name);
}
