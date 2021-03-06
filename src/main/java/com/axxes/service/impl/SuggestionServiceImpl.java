package com.axxes.service.impl;

import com.axxes.persistence.dao.LibraryUserDao;
import com.axxes.persistence.dao.SuggestionDao;
import com.axxes.persistence.domain.Suggestion;
import com.axxes.service.SuggestionService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class SuggestionServiceImpl implements SuggestionService {

    private final SuggestionDao suggestionDao;
    private final LibraryUserDao libraryUserDao;

    public SuggestionServiceImpl(SuggestionDao suggestionDao, LibraryUserDao libraryUserDao) {
        this.suggestionDao = suggestionDao;
        this.libraryUserDao = libraryUserDao;
    }

    @Override
    public void createSuggestion(Suggestion suggestion, long userId) {
        //Get user
        suggestionDao.createSuggestion(suggestion);
    }

    @Override
    public List<Suggestion> getAllSuggestion(long userId) {
        return suggestionDao.getAllSuggestion(userId);
    }

}
