package com.axxes.persistence.domain;

import javax.persistence.*;

/**
 * Created by Alex on 26/08/16.
 */
@Entity
public class Suggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SUGG_SEQ")
    @SequenceGenerator(name = "SUGG_SEQ", sequenceName = "suggest_sequence")
    private long id;

    @ManyToOne
    private User user;

    private String url;
    private String motivation;
    private String isbn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}