package com.kodilla.collections.exercises.dictionary;

public class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String word;

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        this.partOfSpeech = partOfSpeech;
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
