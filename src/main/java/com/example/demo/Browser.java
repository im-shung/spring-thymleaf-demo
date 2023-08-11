package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Browser {

    @Id
    private String name;

    private int sessions;

    private double bounceRate;

    private int transactions;

    public Browser() {
    }

    public Browser(String name, int sessions, double bounceRate, int transactions) {
        this.name = name;
        this.sessions = sessions;
        this.bounceRate = bounceRate;
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Browser{" +
                   "name='" + name + '\'' +
                   ", sessions=" + sessions +
                   ", bounceRate=" + bounceRate +
                   ", transactions=" + transactions +
                   '}';
    }
}
