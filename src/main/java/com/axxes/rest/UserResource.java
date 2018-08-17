package com.axxes.rest;

import com.axxes.persistence.domain.LibaryUser;
import com.axxes.persistence.domain.Suggestion;
import com.axxes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<LibaryUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/madeSuggestion", method = RequestMethod.GET)
    public List<LibaryUser> getUsersWithSuggestion() {
        return userService.getUsersWithSuggestion();
    }

    @RequestMapping(value = "/removeLastSuggestion/{userId}", method = RequestMethod.DELETE)
    public void removeLastSuggestion(@PathVariable long userId) {
        userService.removeLastSuggestion(userId);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createUser(@RequestParam(value="userName") String userName,
                           @RequestParam(value="firstName") String firstName,
                           @RequestParam(value="lastName") String lastName,
                           @RequestParam(value="email") String email) {
        LibaryUser libraryUser = new LibaryUser();
        libraryUser.setFirstName(firstName);
        libraryUser.setLastName(lastName);
        libraryUser.setEmail(email);
        libraryUser.setUserName(userName);
        userService.createUser(libraryUser);
    }

    @RequestMapping(value = "/createUserWithSuggestion", method = RequestMethod.POST)
    public void createUserWithSuggestion(@RequestParam(value="userName") String userName,
                                         @RequestParam(value="firstName") String firstName,
                                         @RequestParam(value="lastName") String lastName,
                                         @RequestParam(value="email") String email) {
        LibaryUser libraryUser = new LibaryUser();
        libraryUser.setFirstName(firstName);
        libraryUser.setLastName(lastName);
        libraryUser.setEmail(email);
        libraryUser.setUserName(userName);
        Suggestion suggestion = new Suggestion();
        suggestion.setUrl("http://www.google.be");
        suggestion.setMotivation("motivation");
        suggestion.setIsbn("1234-1234");
        userService.createUserWithSuggestion(libraryUser, suggestion);
    }

    @RequestMapping(value = "/searchUser/{firstName}", method = RequestMethod.GET)
    public LibaryUser findUserWithFirstName(@PathVariable String firstName) {
        return userService.findUserWithFirstName(firstName);
    }

    @RequestMapping(value = "/updateUserLastName/{id}", method = RequestMethod.PUT)
    public LibaryUser updateUserLastName(@PathVariable long id,
                                         @RequestParam(value="lastName") String lastName) {
        return userService.updateUserLastName(id, lastName);
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public void removeUser(@PathVariable long id) {
        userService.removeUser(id);
    }
}