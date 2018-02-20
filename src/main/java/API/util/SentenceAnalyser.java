package API.util;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


public class SentenceAnalyser {


    /**
     * Validates the correctness of a sentences syntax
     *
     * This validates the correct of sentence syntax for basic sentences that take on the form S: {subject, verb, object}
     *
     * @param sentence
     * @return
     */
    public boolean validate(String[] sentence) {

        return true;
    }


    /**
     * Given a word, provide a list of words that can be followed by it (lookahead words)
     * <p>
     * For example: word = The
     * return = {{adjective: fast, slow, big, quick}, {noun: computer, laptop, server}, etc..}
     *
     * @param word
     * @return
     */
    public Map<String, String[]> lookahead(String word) {

        return null;
    }


    /**
     * Same as above but input is a full sentence.
     * <p>
     * Note, providing only the last word will not be sufficient
     * Investigate the grouping of lexical categories and see if you can derive a proof system
     * <p>
     * This is bonus work that we can look at later
     *
     * @param word
     * @return
     */
    public Map<String, String[]> lookahead(String[] word) {
        return null;
    }
}
