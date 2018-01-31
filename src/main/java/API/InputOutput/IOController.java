package API.InputOutput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IOController {

    @Autowired
    private IOService IOService;

    @RequestMapping("/words")
    public List<IO> getAllWords() {
        return IOService.getAllWords();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/words")
    public void addWord(@RequestBody IO word) {
        IOService.addWord(word);
    }
}
