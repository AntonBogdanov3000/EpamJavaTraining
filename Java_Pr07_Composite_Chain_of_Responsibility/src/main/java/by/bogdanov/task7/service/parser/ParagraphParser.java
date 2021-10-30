package by.bogdanov.task7.service.parser;

import by.bogdanov.task7.bean.Component;
import by.bogdanov.task7.bean.Composite;


public class ParagraphParser {
    private static final ParagraphParser INSTANCE = new ParagraphParser();
    private final static String REGEX_PARAGRAPH = "    ";

    private ParagraphParser(){
    }
    public static ParagraphParser getInstance(){
        return INSTANCE;
    }


  public Component paragraphParse(String text){
      Component allText = new Composite();
      String [] paragraphList = text.split(REGEX_PARAGRAPH);
      for(String element : paragraphList){
          Component paragraphs = SentenceParser.getInstance().paragraphToSentence(element);
          allText.add(paragraphs);
      }
      return allText;
  }
}
