package com.company.controller;

import com.company.daoImpl.DictionaryImpl;

import java.util.Scanner;

public class MainMenu {
    static DictionaryImpl dictionary = new DictionaryImpl();

    public void run() {
        menu();
        Scanner scanner = new Scanner(System.in);
        int variable;
        do {
            variable = scanner.nextInt();
            switch (variable) {
                case 1:
                    dictionary.addWord();
                    menu();
                    break;
                case 2:
                    dictionary.findWord();
                    menu();
                    break;
                case 3:
                    dictionary.showAll();
                    menu();
                    break;
            }

        } while (!(variable == 4));
    }

    private void menu() {
        System.out.println("1 - Add new word");
        System.out.println("2 - Search a word");
        System.out.println("3 - Show all word in dictionary");
        System.out.println("4 - close ");
    }
}
