package API.controller;

import API.entity.Token;
import API.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ResourceLoader rl;

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
    @RequestMapping(method = RequestMethod.POST, value = "/words")
    public void addSentence(@RequestBody List<Token> sentence) {
        tokenService.addSentence(sentence);
    }

    // get list of newly inputed words
    @RequestMapping(method = RequestMethod.GET, value = "/words")
    public List<Token> getSentence() {
        return tokenService.getSentence();
    }


    // get map of <position, token>
    @RequestMapping(method = RequestMethod.GET, value = "/map1")
    public Map<Integer, Token> posTokenMap() {
        return tokenService.posTokenMap();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/x")
    public Map<String, Set<String>> categoriseWord(Resource file) {
        tokenService.categoriseWord(rl);
    }


    /**
     * Validates the correctness of a sentences syntax
     *
     * @param sentence
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/validate")
    public boolean validate(@RequestBody List<Token> sentence) {
        return tokenService.validate(sentence);
    }




}
