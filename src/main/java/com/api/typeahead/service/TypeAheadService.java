package com.api.typeahead.service;

import com.api.typeahead.configurations.DictionaryConfiguration;
import com.api.typeahead.dto.ResponseDto;
import com.api.typeahead.dto.Token;
import com.api.typeahead.resolver.TypeAheadResolver;
import com.api.typeahead.resolver.TypeAheadResolverBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TypeAheadService {

    @Autowired
    DictionaryConfiguration dictionaryConfiguration;

    public ResponseDto getWords(List<Token> tokens) {
        // Map<category, ListOfWords>
        Map<String, List<String>> dictMap = dictionaryConfiguration.getDict();

        TypeAheadResolver resolver = new TypeAheadResolverBasic();
        ResponseDto typeAheadData = resolver.getTypeAheadData(tokens, dictMap);

        return typeAheadData;
    }

}
