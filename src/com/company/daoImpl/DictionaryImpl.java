package com.company.daoImpl;

import com.company.dao.DaoDictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryImpl implements DaoDictionary {
    static Map<String, String> dictionary = new HashMap<String, String>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addWord() {
        System.out.println("Give a word");
        String word = scanner.next();
        System.out.println("Give a translate");
        String word2 = scanner.next();
        dictionary.put(word, word2);
    }

    @Override
    public void findWord() {
        System.out.println("Enter the word you are looking for");
        String value = scanner.next();
        dictionary.get(value);
        if (dictionary.get(value) == null) {
            System.out.println("There is no such word in the dictionary");
        } else {
            System.out.println(dictionary.get(value));
        }
    }

    @Override
    public void showAll() {
        if (dictionary.isEmpty()) {
            System.out.println("w słowniku nie ma słów dodaj jakieś słowo");
        } else {
            System.out.println(dictionary.toString());
        }
    }
}
