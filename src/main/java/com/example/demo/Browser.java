package com.example.demo;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
        name = "Search_browser",
        procedureName = "Search_browser",
        resultClasses = {Browser.class},
        parameters = { //저장 프로시저의 매개변수와 일치하는 매개변수 목록
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "NAME1", type = String.class)
        }
    )
})
@Table(schema = "demo", name = "browser")
public class Browser {

    @Id
    private String name;

    @Column(nullable = true)
    private int sessions;

    @Column(nullable = true)
    private double bounceRate;

    @Column(nullable = true)
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
