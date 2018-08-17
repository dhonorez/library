package com.axxes.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by Alex on 26/08/16.
 */
@Entity
public class Suggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "libraryuser_id")
    private LibaryUser libraryUser;
    @Column
    private String url;
    @Column
    private String motivation;
    @Column
    private String isbn;

    public Suggestion(long id, LibaryUser libraryUser, String url, String motivation, String isbn) {
        this.id = id;
        this.libraryUser = libraryUser;
        this.url = url;
        this.motivation = motivation;
        this.isbn = isbn;
    }

    public Suggestion() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LibaryUser getLibraryUser() {
        return libraryUser;
    }

    public void setLibraryUser(LibaryUser libraryUser) {
        this.libraryUser = libraryUser;
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

    public static class Builder {

        private long id;
        private LibaryUser libraryUser;
        private String url;
        private String motivation;
        private String isbn;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setLibraryUser(LibaryUser libraryUser) {
            this.libraryUser = libraryUser;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setMotivation(String motivation) {
            this.motivation = motivation;
            return this;
        }

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }


        public Suggestion build() {
            return new Suggestion(id, libraryUser, url, motivation, isbn);
        }
    }
}