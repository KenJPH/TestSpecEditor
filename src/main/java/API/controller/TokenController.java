package API.controller;

import API.entity.Token;
import API.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class TokenController {

    @Autowired
    private TokenService tokenService;
//
//    // get list of brute words list
//    @RequestMapping(method = RequestMethod.GET, value = "/brutewords")
//    public List<Token> getBruteWords() {
//        return tokenService.getBruteWords();
//    }
//
//    // append one word to brute words list
//    @RequestMapping(method = RequestMethod.POST, value = "/addword")
//    public void addWord(@RequestBody Token token) {
//        tokenService.addWord(token);
//    }


    // add list of words
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void addSentence(@RequestBody List<Token> sentence) {
        tokenService.addSentence(sentence);
    }

    // get list of newly inputed words
    @RequestMapping(method = RequestMethod.GET, value = "/words")
    public List<Token> getSentence() {
        return tokenService.getSentence();
    }


    /**
     * Validates the correctness of a sentences syntax
     *
     * This validates the correct of sentence syntax for basic sentences that take on the form S: {subject, verb, object}
     *
     * @param sentence
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, consumers = MediaType.APPLICATION_JSON_VALUE)
    public boolean validate(@RequestBody List<String> sentence) {
        return tokenService.validate(sentence);
    }




}
