package com.api.typeahead.resolver;

import com.api.typeahead.dto.ResponseDto;
import com.api.typeahead.dto.Token;

import java.util.List;
import java.util.Map;

public abstract class TypeAheadResolver {


    /**
     * Resolves the next available categories and their corresponding words
     *
     * @param tokens
     * @param dictionary
     * @return A list of categories and their corresponding words
     */
    public abstract ResponseDto getTypeAheadData(List<Token> tokens, Map<String, List<String>> dictionary);

}
