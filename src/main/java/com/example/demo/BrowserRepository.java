package com.example.demo;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrowserRepository extends CrudRepository<Browser, String> {
    @Procedure("demo.Search_browser")
    Browser Search_browser(String name);
}
