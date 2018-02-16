package API.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SentenceAnalyser {

    private String[] nouns = new String[20];
    private String[] determiners = new String[20];
    private String[] adjectives = new String[20];


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
        Map<String, String[]> detLookahead = new HashMap<>();

        if (Arrays.asList(determiners).contains(word)) {
            detLookahead.put(word, adjsnouns(nouns, adjectives));
            return detLookahead;
        }

    }


    /**
     * Helper method that concatenates array of nouns and adjectives
     *
     * Nouns and adjectives are the only word type that can follow a determiner such as "the" or "a"
     *
     * @param adj array of adjs
     * @param nouns array of nouns
     * @return arrays concatenated as one array
     */
    public String[] adjsnouns(String[] adj, String[] nouns) {
        String[] result = new String[nouns.length + adj.length];
        for (int i = 0; i < nouns.length; i++) {
            result[i] = nouns[i];
        }
        for (int j = 0; j < adj.length; j++) {
            result[j + 20] = adj[j];
        }
        return result;
    }


    public Map<String, String[]> detLookahead(String word) {
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


        // if word = determiner, return <word, adjectives[] || noun[]>
        // if word = an adjective, return <word, nouns[]>
        // if word = a noun, return <word, verb[]>
        return null;
    }
}
