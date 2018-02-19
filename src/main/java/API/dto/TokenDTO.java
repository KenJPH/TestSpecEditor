package API.dto;

import API.entity.Token;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TokenDTO {

    private List<Token> inputTokens = new ArrayList<>();
    private Map<String, Set<String>> wordCat;


//    private List<Token> tokens = new ArrayList<>(Arrays.asList(
//            new Token(1, "user"),
//            new Token(2, "navigates"),
//            new Token(3, "to"),
//            new Token(4, "website")
//    ));
//
//
//    public List<Token> getBruteWords() {
//        return tokens;
//    }
//
//    public void addWord(Token token) {
//        tokens.add(token);
//    }

    public List<Token> getSentence() {
        return inputTokens;
    }

    public void addSentence(List<Token> sentence) {
        for (Token t : sentence) {
            inputTokens.add(t);
        }
    }

    public boolean validate(List<String> sentence) {
        for (String s : sentence) {

        }
        return true;
    }
}
