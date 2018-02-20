package API.dto;

import API.entity.Token;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TokenDTO {

    private List<Token> inputTokens = new ArrayList<>();
    private Map<Integer, Token> positionToken = new HashMap<>();
    private static Map<String, String[]> lexCat;

    static {

        lexCat = new HashMap<String, String[]>() {
            {
                put("noun", new String[] {"user", "cars", "man"});
                put("verb", new String[] {"navigates", "drive", "ran"});
                put("adjective", new String[] {"smart", "fast", "dumb"});
                put("adverb", new String[] {"quickly", "smoothly"});
                put("pronoun", new String[] {"i", "he", "us"});
                put("determiner", new String[] {"the", "a"});
                put("conjunction", new String[] {"and", "but"});
                put("preposition", new String[] {"to", "in", "on"});

            }
        };

    }

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

    public void addSentence(List<Token> sentence) {
        for (Token s : sentence) {
            inputTokens.add(s);
        }
    }

    public List<Token> getSentence() {
        return inputTokens;
    }

    public Map<Integer, Token> posTokenMap() {
        for (int i = 0; i < inputTokens.size(); i++){
            positionToken.put(i, inputTokens.get(i));
        }
        return positionToken;
    }

    public int getArrayEntry(String[] arr, String word){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == word)
                return i;
        }
        return -1;
    }


    public boolean validate(List<Token> inputTokens) {
        for (int i = 0; i < inputTokens.size(); i++){
            if (inputTokens.get(i) != lexCat.get("noun"))
        }
        return true;
    }

}
