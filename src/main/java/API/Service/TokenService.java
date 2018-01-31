package API.Service;


import API.DataTransferObjects.Token;
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

    public void addWord(Token word) {
        // add word to list of words
        words.add(word);
    }
}
