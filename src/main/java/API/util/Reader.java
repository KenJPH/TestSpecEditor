package API.util;

import API.entity.Token;
import gherkin.lexer.Fi;
import org.apache.tomcat.jni.File;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Configuration
public class Reader {


    private List<Token> tokenList = new ArrayList<>();


    private FileReader[] files = {
            new FileReader("src/main/resources/adjective.txt"),
            new FileReader("src/main/resources/adverb.txt"),
            new FileReader("src/main/resources/conjunction.txt"),
            new FileReader("src/main/resources/determiner.txt"),
            new FileReader("src/main/resources/noun.txt"),
            new FileReader("src/main/resources/preposition.txt"),
            new FileReader("src/main/resources/pronoun.txt"),
            new FileReader("src/main/resources/verb.txt"),
    };


    public Reader() throws FileNotFoundException {
    }


    public Map<Token, Set<String>> mapWord(FileReader file, String cat) {
        Map<Token, Set<String>> wordCat = new HashMap<>();
        Set<String> set = new HashSet<>();
        {
            try {
                BufferedReader br = new BufferedReader(file);
                String current;

                set.add(cat);

                while ((current = br.readLine()) != null) {
                    wordCat.put(new Token(current), set);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return wordCat;
        }
    }

    /**
     * adds each map
     *
     * @return
     */
    public List<Map> getListOfMapCategories() {

        List<Map> maps = new ArrayList<>();

        for (int i = 0; i < files.length; i++) {
            FileReader file = files[i];

            if (i == 0) {
                maps.add(mapWord(file, "adjective"));
            } else if (i == 1) {
                maps.add(mapWord(file, "adverb"));
            } else if (i == 2) {
                maps.add(mapWord(file, "conjunction"));
            } else if (i == 3) {
                maps.add(mapWord(file, "determiner"));
            } else if (i == 4) {
                maps.add(mapWord(file, "noun"));
            } else if (i == 5) {
                maps.add(mapWord(file, "preposition"));
            } else if (i == 6) {
                maps.add(mapWord(file, "pronoun"));
            } else if (i == 7) {
                maps.add(mapWord(file, "verb"));
            } else {
                System.out.println("idiot word");
            }
        }
        return maps;
    }
}
