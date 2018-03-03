package com.api.typeahead.resolver;

import com.api.typeahead.dto.ResponseDto;
import com.api.typeahead.dto.Token;

import java.util.List;
import java.util.Map;

public class TypeAheadResolverBasic extends TypeAheadResolver {

    /**
     * Resolves the next available categories and their corresponding words
     * which is syntactically correct based on the _____ theory.
     *
     * For this basic approach, we only consider the last token.
     *
     * @param tokens
     * @param dictionary
     * @return A list of categories and their corresponding words to make it syntactically correct
     */
    @Override
    public ResponseDto getTypeAheadData(List<Token> tokens, Map<String, List<String>> dictionary) {
        return null;
    }

    private String getCategory(String word) {
        return "";
    }






}
