package API.util;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SentenceAnalyser {

    String objectNoun;
    String subjectNoun;
    String verb;
    String preposition;
    String determiner;

    String[] array = {"Given", "user", "navigates", "website"};
    String[] array1 = {"When", "user", "searches", "name"};
    String[] array2 = {"And", "user", "presses", "search"};
    String[] array3 = {"Then", "user", "see", "results"};


    /**
     * Validates the correctness of a sentences syntax
     *
     * This validates the correct of sentence syntax for basic sentences that take on the form S: {subject, verb, object}
     *
     * @param sentence
     * @return
     */
    public boolean validate(String[] sentence) {
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[0] == "Given" || sentence[0] == "When" || sentence[0] == "And" || sentence[0] == "Then") {
                if (sentence[1] != objectNoun && sentence[2] != verb && sentence[3] != subjectNoun) {
                    return false;
                }
            }
        }
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
        Map<String, String[]> tmp = new HashMap<>();


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
