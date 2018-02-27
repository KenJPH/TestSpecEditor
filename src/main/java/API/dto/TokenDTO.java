package API.dto;

import API.entity.Token;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Component
public class TokenDTO {

    private List<Token> inputTokens = new ArrayList<>();
    private Map<Integer, Token> positionToken = new HashMap<>();


//    private List<Token> tokens = new ArrayList<>(Arrays.asList(
//            new Token("user"),
//            new Token("navigates"),
//            new Token("to"),
//            new Token("website")
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




    public List<Token> fileToToken() {
        List<String> adj = new ArrayList<>();
        List<Token> tokenList = new ArrayList<>();

        FileReader file;
        BufferedReader br;

        {
            try {
                file = new FileReader("src/main/resources/adjective.txt");
                br = new BufferedReader(file);

                String current;

                while ((current = br.readLine()) != null) {
                    adj.add(current);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < adj.size(); i++){
            tokenList.add(new Token(adj.get(i)));
            System.out.println(tokenList.get(i).getWord());
        }
        return tokenList;
    }




}
