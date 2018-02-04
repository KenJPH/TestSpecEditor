package API.dto;

public class Token {

    private String word;

    public Token(){};

    public Token(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
