package com.axxes.persistence.domain;

import javax.persistence.*;

/**
 * Created by Alex on 26/08/16.
 */
@Entity
public class Tag {

    @Id
    @GeneratedValue
    private long id;
    private String value;

    @ManyToOne
    private Book book;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}