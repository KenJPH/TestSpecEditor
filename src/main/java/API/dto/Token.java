package API.dto;

import org.springframework.beans.factory.annotation.Value;

public class Token {

    @Value("pos")
    private Integer pos;

    @Value("word")
    private String word;

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
