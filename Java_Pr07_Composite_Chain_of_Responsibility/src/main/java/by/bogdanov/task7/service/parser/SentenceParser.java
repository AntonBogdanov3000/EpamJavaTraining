package by.bogdanov.task7.service.parser;

import by.bogdanov.task7.bean.Component;
import by.bogdanov.task7.bean.Composite;

public class SentenceParser {

  private static SentenceParser INSTANCE = new SentenceParser();
  private static String REGEX_SENTENCE = "[\\.]+|[\\?!]";

  private SentenceParser(){
  }
  public static SentenceParser getInstance(){
      return INSTANCE;
  }

  public Component paragraphToSentence(String text){
      Component paragraph = new Composite();
      String [] sentenceList = text.split(REGEX_SENTENCE);
      for(String element : sentenceList) {
          Component sentence = WordParser.getInstance().sentenceToWords(element);
          paragraph.add(sentence);
      }
      return paragraph;
  }
}
