package com.axxes.rest;

import com.axxes.persistence.domain.Suggestion;
import com.axxes.service.SuggestionService;
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
@RequestMapping("/suggestion")
public class SuggestionResource {

    private final SuggestionService suggestionService;

    public SuggestionResource(SuggestionService suggestionService) {
        this.suggestionService = suggestionService;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createSuggestion(@RequestParam(value="userId") long userId,
                                 @RequestParam(value="url") String url,
                                 @RequestParam(value="motivation") String motivation,
                                 @RequestParam(value="isbn") String isbn) {
        Suggestion suggestion = new Suggestion();
        suggestion.setIsbn(isbn);
        suggestion.setMotivation(motivation);
        suggestion.setUrl(url);

        suggestionService.createSuggestion(suggestion, userId);
    }

    @RequestMapping(value = "/getAllSuggestion/{userId}", method = RequestMethod.GET)
    public List<Suggestion> getAllSuggestion(@PathVariable long userId) {
        return suggestionService.getAllSuggestion(userId);
    }

}
