package com.axxes.service;

import com.axxes.persistence.domain.LibaryUser;
import com.axxes.persistence.domain.Suggestion;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
public interface UserService {
    List<LibaryUser> getUsersWithSuggestion();

    void removeLastSuggestion(long userId);

    void createUser(LibaryUser libraryUser);

    LibaryUser findUserWithFirstName(String firstName);

    List<LibaryUser> getAllUsers();

    LibaryUser updateUserLastName(long id, String lastName);

    void createUserWithSuggestion(LibaryUser libraryUser, Suggestion suggestion);

    void removeUser(long id);

}
