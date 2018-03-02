package com.api.typeahead.controller;

import com.api.typeahead.dto.TokenWrapper;
import com.api.typeahead.dto.ResponseDto;
import com.api.typeahead.dto.Token;
import com.api.typeahead.service.TypeAheadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class TypeAheadController {

    @Autowired
    private TypeAheadService typeAheadService;

    @PostMapping(value = "/resolve", consumes="application/json", produces="application/json")
    public ResponseDto getWords(@RequestBody TokenWrapper tokenWrapper) {
        List<Token> tokens = tokenWrapper.getTokens();
        return typeAheadService.getWords(tokens);
    }

}
