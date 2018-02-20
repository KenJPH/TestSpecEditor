package API.dto;

import API.entity.Token;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TokenDTO {

    private Token token;

    private List<Token> inputTokens = new ArrayList<>();
    private Map<Integer, Token> posWord;

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
        for (int i = 1 ; i < sentence.size() + 1; i++) {
            posWord.put(i, sentence.get(i));
        }
    }

    public boolean validate(List<String> sentence) {
        for (String s : sentence) {

        }
        return true;
    }
}
