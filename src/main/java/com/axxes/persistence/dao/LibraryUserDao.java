package com.axxes.persistence.dao;

import com.axxes.persistence.domain.LibaryUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LibraryUserDao {

    public List<LibaryUser> getUsersWithSuggestion() {
        return null;
    }

    public void removeLastSuggestion(long userId) {

    }

    public void createUser(LibaryUser libraryUser) {

    }

    public LibaryUser findUserWithFirstName(String firstName) {
        return null;
    }

    public List<LibaryUser> getAllUsers() {
        return null;
    }

    public LibaryUser updateUserLastName(long id, String lastName) {
        return null;
    }

    public void removeUser(long id) {
    }

}
