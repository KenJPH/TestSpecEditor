package API.entity;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Token {

    private int pos;
    private String word;
    private Map<String, List<Token>> cat;

    public Token(){};

    public Token(String word) {
        this.word = word;
    }

    public Token(int pos, String word) {
        this.pos = pos;
        this.word = word;
    }

    public Token(int pos, String word, Map<String, List<Token>> cat) {
        this.pos = pos;
        this.word = word;
        this.cat = cat;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }


    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Map<String, List<Token>> getCat() {
        return cat;
    }

    public void setCat(Map<String, List<Token>> cat) {
        this.cat = cat;
    }
}
