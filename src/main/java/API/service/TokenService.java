package API.service;


import API.dto.Token;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TokenService {

    private List<Token> words = new ArrayList<>(Arrays.asList(
            new Token("hello"),
            new Token("world")
    ));

    public List <Token> getAllWords(){
        return words;
    }


    // add word to list of words
    public void addWord(Token word) {
        words.add(word);
    }
}
