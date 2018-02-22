package API.dto;

import API.entity.Token;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TokenDTO {

    private List<Token> nouns = new ArrayList<>(Arrays.asList(
            new Token("user"),
            new Token("cars"),
            new Token("man")
    ));
    private List<Token> verbs = new ArrayList<>(Arrays.asList(
            new Token("navigates"),
            new Token("drive"),
            new Token("ran")
    ));
    private List<Token> adjectives = new ArrayList<>(Arrays.asList(
            new Token("smart"),
            new Token("fast"),
            new Token("dumb")
    ));
    private List<Token> adverbs = new ArrayList<>(Arrays.asList(
            new Token("quickly"),
            new Token("smoothly")
    ));
    private List<Token> pronouns = new ArrayList<>(Arrays.asList(
            new Token("i"),
            new Token("he"),
            new Token("us")
    ));
    private List<Token> determiners = new ArrayList<>(Arrays.asList(
            new Token("the"),
            new Token("a")
    ));
    private List<Token> conjunctions = new ArrayList<>(Arrays.asList(
            new Token("and"),
            new Token("but")
    ));
    private List<Token> prepositions = new ArrayList<>(Arrays.asList(
            new Token("to"),
            new Token("in"),
            new Token("on")
    ));


    private List<Token> inputTokens = new ArrayList<>();
    private Map<Integer, Token> positionToken = new HashMap<>();

    private Map<String, List<Token>> lexCat = new HashMap<>() {
            {
                put("noun", nouns);
                put("verb", verbs);
                put("adjective", adjectives);
                put("adverb", adverbs);
                put("pronoun", pronouns);
                put("determiner", determiners);
                put("conjunction", conjunctions);
                put("preposition", prepositions);

            }
        };

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
            positionToken.put(i + 1, inputTokens.get(i));
        }
        return positionToken;
    }


    public boolean validate(List<Token> inputTokens) {
        for (int i = 0; i < inputTokens.size(); i++) {
            if (inputTokens.get(i+1).getPos() == 1 && (inputTokens.get(i+2).getWord()).equals(determiners.get(i))) {   System.out.println("i is: " +i);
                inputTokens.get(i+1).getPos()

            }
        }
        return true;
    }



}
