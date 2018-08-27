package com.axxes.service.impl;

import com.axxes.persistence.dao.LibraryUserDao;
import com.axxes.persistence.dao.SuggestionDao;
import com.axxes.persistence.domain.LibaryUser;
import com.axxes.persistence.domain.Suggestion;
import com.axxes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private LibraryUserDao libraryUserDao;

    @Autowired
    private SuggestionDao suggestionDao;

    @Override
    public List<LibaryUser> getUsersWithSuggestion() {
        return libraryUserDao.getUsersWithSuggestion();
    }

    @Override
    public void removeLastSuggestion(long userId) {
        libraryUserDao.removeLastSuggestion(userId);
    }

    @Override
    public void createUser(LibaryUser libraryUser) {
        libraryUserDao.createUser(libraryUser);
    }

    @Override
    public LibaryUser findUserWithFirstName(String firstName) {
        return libraryUserDao.findUserWithFirstName(firstName);
    }

    @Override
    public List<LibaryUser> getAllUsers() {
        return libraryUserDao.getAllUsers();
    }

    @Override
    public LibaryUser updateUserLastName(long id, String lastName) {
        return libraryUserDao.updateUserLastName(id, lastName);
    }

    @Override
    public void createUserWithSuggestion(LibaryUser libraryUser, Suggestion suggestion) {

    }

    @Override
    public void removeUser(long id) {
        libraryUserDao.removeUser(id);
    }
}