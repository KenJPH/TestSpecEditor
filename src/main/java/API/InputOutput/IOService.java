package API.InputOutput;


import org.springframework.stereotype.Service;
import java.io.*;
import java.util.*;

@Service
public class IOService {

    private List<IO> words = new ArrayList<>(Arrays.asList(
            new IO ("hello"),
            new IO ("world")
    ));

    public List <IO> getAllWords(){
        return words;
    }

    public void addWord(IO word) {
        // add word to list of words
        words.add(word);
    }
}
