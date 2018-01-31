package API.Controller;

import API.DataTransferObjects.Token;
import API.Service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TokenController {

    @Autowired
    private TokenService TokenService;

    @RequestMapping("/words")
    public List<Token> getAllWords() {
        return TokenService.getAllWords();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/words")
    public void addWord(@RequestBody Token word) {
        TokenService.addWord(word);
    }
}
