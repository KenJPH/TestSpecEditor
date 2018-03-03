package com.api.typeahead.controller;

import com.api.typeahead.configurations.DictionaryConfiguration;
import com.api.typeahead.dto.ResponseDto;
import com.api.typeahead.dto.Token;
import com.api.typeahead.dto.TokenWrapper;
import com.api.typeahead.service.TypeAheadService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeAheadControllerTest {

    @Autowired
    TypeAheadController typeAheadController;

    @Autowired
    private TypeAheadService typeAheadService;

    @Autowired
    private DictionaryConfiguration dictionaryConfiguration;

    private ResponseDto response = new ResponseDto();

    @Before
    public void setUp() {
        response.setAdjective(dictionaryConfiguration.getDict().get("adjective"));
        response.setAdverb(dictionaryConfiguration.getDict().get("adverb"));
        response.setConjunction(dictionaryConfiguration.getDict().get("conjunction"));
        response.setDeterminer(dictionaryConfiguration.getDict().get("determiner"));
        response.setNoun(dictionaryConfiguration.getDict().get("noun"));
        response.setPreposition(dictionaryConfiguration.getDict().get("preposition"));
        response.setPronoun(dictionaryConfiguration.getDict().get("pronoun"));
        response.setVerb(dictionaryConfiguration.getDict().get("verb"));
    }

    @Test
    public void EmtpyTokensRequest() {
//        given(typeAheadService.getWords(any(List.class))).willReturn(response);

        TokenWrapper tokenWrapper = new TokenWrapper();
        tokenWrapper.setTokens(new ArrayList<Token>());
        ResponseDto responseResult = typeAheadController.getWords(tokenWrapper);

        System.out.println(responseResult.getAdjective());
    }

}
