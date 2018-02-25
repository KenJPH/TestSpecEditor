package API.entity;


import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@Component
public class Token {

    private String word;

    public Token() {
    }

    public Token(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public Map<String, Set<String>> categoriseWord(Resource file) throws IOException {
        Map<String, Set<String>> wordCat = new HashMap<>();
        List<String> lines = Files.readAllLines(Paths.get(file.getURI()), StandardCharsets.UTF_8);

        for (String word : lines) {
            if (file.getFilename().equals("noun.txt")) {
                Set<String> adjective = new HashSet<>();
                wordCat.put(word, adjective);
            }
            else if (file.getFilename().equals("verb.txt")){
                Set<String> adverb = new HashSet<>();
                wordCat.put(word, adverb);
            }
            else if (file.getFilename().equals("verb.txt")){
                Set<String> conjunction = new HashSet<>();
                wordCat.put(word, conjunction);
            }
            else if (file.getFilename().equals("verb.txt")){
                Set<String> determiner = new HashSet<>();
                wordCat.put(word, determiner);
            }
            else if (file.getFilename().equals("verb.txt")){
                Set<String> noun = new HashSet<>();
                wordCat.put(word, noun);
            }
            else if (file.getFilename().equals("verb.txt")){
                Set<String> preposition = new HashSet<>();
                wordCat.put(word, preposition);
            }
            else if (file.getFilename().equals("verb.txt")){
                Set<String> pronoun = new HashSet<>();
                wordCat.put(word, pronoun);
            }
            else if (file.getFilename().equals("verb.txt")){
                Set<String> verb = new HashSet<>();
                wordCat.put(word, verb);
            }
            else {
                Set<String> other = new HashSet<>();
                wordCat.put(word, other);
            }

        }
        return wordCat;
    }
}
