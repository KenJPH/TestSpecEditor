package com.api.typeahead.dto;

import java.util.List;

public class ResponseDto {

    private List<String> adjective;
    private List<String> adverb;
    private List<String> conjunction;
    private List<String> determiner;
    private List<String> noun;
    private List<String> preposition;
    private List<String> pronoun;
    private List<String> verb;

    public List<String> getAdjective() {
        return adjective;
    }

    public void setAdjective(List<String> adjective) {
        this.adjective = adjective;
    }

    public List<String> getAdverb() {
        return adverb;
    }

    public void setAdverb(List<String> adverb) {
        this.adverb = adverb;
    }

    public List<String> getConjunction() {
        return conjunction;
    }

    public void setConjunction(List<String> conjunction) {
        this.conjunction = conjunction;
    }

    public List<String> getDeterminer() {
        return determiner;
    }

    public void setDeterminer(List<String> determiner) {
        this.determiner = determiner;
    }



    public List<String> getNoun() {
        return noun;
    }

    public void setNoun(List<String> noun) {
        this.noun = noun;
    }

    public List<String> getPreposition() {
        return preposition;
    }

    public void setPreposition(List<String> preposition) {
        this.preposition = preposition;
    }

    public List<String> getPronoun() {
        return pronoun;
    }

    public void setPronoun(List<String> pronoun) {
        this.pronoun = pronoun;
    }

    public List<String> getVerb() {
        return verb;
    }

    public void setVerb(List<String> verb) {
        this.verb = verb;
    }
}
