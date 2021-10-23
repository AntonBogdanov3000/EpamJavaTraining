package app.service.SAXParser;

import app.entities.Medicines;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;


public class MedicinesSAXBuilder {

    private Set<Medicines> medicines;
    private MedicinesHandler mh;

    public Set<Medicines>getMedicines(){
        return this.medicines;
    }
    public MedicinesHandler getMh(){
        return mh;
    }

    public MedicinesSAXBuilder(){
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try(InputStream is = getXMLFileAsStream()) {
            SAXParser saxParser = factory.newSAXParser();
            mh = new MedicinesHandler();
            saxParser.parse(is,mh);
            medicines = mh.getResult();
        }catch (ParserConfigurationException |IOException | SAXException e){
            System.out.println(e.getMessage());
        }
    }
    private static InputStream getXMLFileAsStream(){
        return MedicinesSAXBuilder.class.getClassLoader().getResourceAsStream("medicins.xml");
    }
}
