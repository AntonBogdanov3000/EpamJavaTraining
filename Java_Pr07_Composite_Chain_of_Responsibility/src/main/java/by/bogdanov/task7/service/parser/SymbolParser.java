package by.bogdanov.task7.service.parser;

import by.bogdanov.task7.bean.Component;
import by.bogdanov.task7.bean.Composite;
import by.bogdanov.task7.bean.Leaf;

public class SymbolParser {

    private static final SymbolParser INSTANCE = new SymbolParser();

    private SymbolParser(){
    }
    public static SymbolParser getInstance(){
        return INSTANCE;
    }

    public Component symbolParser(String text){
        Component symbolList = new Composite();
        char[] data = text.toCharArray();
        for (char symbol : data) {
            symbolList.add(new Leaf(symbol));
        }
        return symbolList;
    }
}
