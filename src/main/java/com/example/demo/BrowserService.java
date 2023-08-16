package com.example.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BrowserService {

    @PersistenceContext
    private EntityManager em;

    public Browser Search_browser(String name) {
        return (Browser) em.createNamedStoredProcedureQuery("Search_browser")
                   .setParameter("NAME1", name).getSingleResult();
    }

}
