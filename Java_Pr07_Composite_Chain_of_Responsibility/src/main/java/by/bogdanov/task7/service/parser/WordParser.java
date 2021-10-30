package by.bogdanov.task7.service.parser;

import by.bogdanov.task7.bean.Component;
import by.bogdanov.task7.bean.Composite;

public class WordParser {

    private static String WORD_REGEX = "(?<=[ \\n])";
    private static final WordParser INSTANCE = new WordParser();

    private WordParser(){
    }
    public static WordParser getInstance(){
        return INSTANCE;
    }

    public Component sentenceToWords(String text){
     Component word = new Composite();
     String [] wordsList = text.split(WORD_REGEX);
        for(String element : wordsList) {
            Component symbol = SymbolParser.getInstance().symbolParser(element);
            word.add(symbol);
        }
        return word;
    }
}
