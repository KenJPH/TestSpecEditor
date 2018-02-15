package API.util;

import java.util.Map;

public class SentenceAnalyser {


    /**
     * Validates the correctness of a sentences syntax
     *
     * @param sentence
     * @return
     */
    public boolean validate(String[] sentence) {
        return true;
    }


    /**
     * Given a word, provide a list of words that can be followed by it (lookahead words)
     *
     * For example: word = The
     *              return = {{adjective: fast, slow, big, quick}, {noun: computer, laptop, server}, etc..}
     *
     * @param word
     * @return
     */
    public Map<String, String[]> lookahead(String word) {

        return null;
    }


    /**
     * Same as above but input is a full sentence.
     *
     * Note, providing only the last word will not be sufficient
     * Investigate the grouping of lexical categories and see if you can derive a proof system
     *
     * This is bonus work that we can look at later
     *
     * @param word
     * @return
     */
    public Map<String, String[]> lookahead(String[] word) {
        return null;
    }
}
