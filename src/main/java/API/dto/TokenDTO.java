package API.dto;

import API.entity.Token;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TokenDTO {

    private List<Token> inputTokens = new ArrayList<>();
    private Map<Integer, Token> positionToken = new HashMap<>();
    private Map<Token, List<String>> lexCat;
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

    public void addSentence(List<Token> input) {
        for (Token s : input) {
            inputTokens.add(s);
        }
    }

    public List<Token> getSentence() {
        return inputTokens;
    }


    public Map<Integer, Token> posTokenMap() {
        for (int i = 0; i < inputTokens.size(); i++){
            positionToken.put(i+1, inputTokens.get(i));
        }
        return positionToken;
    }


    public boolean validate(List<Token> inputTokens) {
        return true;
    }





}
