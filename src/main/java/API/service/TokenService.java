package API.service;


import API.dto.TokenDTO;
import API.entity.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TokenService {

    @Autowired
    TokenDTO tokenDTO;

//    // get list of words ie. the sentence
//    public List<Token> getBruteWords(){
//        return tokenDTO.getBruteWords();
//    }
//
//    // add word to list
//    public void addWord(Token token) {
//        tokenDTO.addWord(token);
//    }


    public List<Token> getSentence() {
        return tokenDTO.getSentence();
    }

    public void addSentence(List<Token> sentence) {
        tokenDTO.addSentence(sentence);
    }

    public boolean validate(List<String> sentence) {
        return tokenDTO.validate(sentence);
    }
}
