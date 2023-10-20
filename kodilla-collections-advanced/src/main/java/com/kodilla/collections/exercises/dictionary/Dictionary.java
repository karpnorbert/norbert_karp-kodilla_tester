package com.kodilla.collections.exercises.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Dictionary {
    private Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, new ArrayList<>());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        List<EnglishWord> words = dictionary.getOrDefault(polishWord, new ArrayList<>());
        for (EnglishWord word : words) {
            if (word.getPartOfSpeech() == partOfSpeech) {
                result.add(word);
            }
        }
        return result;
    }

    public int size() {
        return dictionary.size();
    }
}