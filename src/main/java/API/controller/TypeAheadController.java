package API.controller;

import API.dto.TokenWrapper;
import API.dto.ResponseDto;
import API.dto.Token;
import API.service.TypeAheadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class TypeAheadController {

    @Autowired
    private TypeAheadService typeAheadService;

    @PostMapping(value = "/words", consumes="application/json",produces="application/json")
    public ResponseDto getWords(@RequestBody TokenWrapper tokenWrapper) {
        List<Token> tokens = tokenWrapper.getTokens();
        return typeAheadService.getWords(tokens);
    }

}
