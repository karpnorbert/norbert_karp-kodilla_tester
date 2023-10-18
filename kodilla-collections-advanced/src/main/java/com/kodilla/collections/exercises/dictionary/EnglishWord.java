package com.kodilla.collections.exercises.dictionary;

import java.util.Objects;

class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        this.partOfSpeech = partOfSpeech;
        this.word = word;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getWord() {
        return word;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return partOfSpeech == that.partOfSpeech && word.equals(that.word);
    }

    public int hashCode() {
        return Objects.hash(partOfSpeech, word);
    }
}