package app.model;

import app.entities.Medicines;
import app.service.DomParser.MedicinesDOMBuilder;
import app.service.SAXParser.MedicinesSAXBuilder;
import java.util.Set;

import java.io.File;

public class Model {
    private static Model instance = new Model();
    private MedicinesDOMBuilder mdb;
    private MedicinesSAXBuilder msb;

    public static Model getInstance(){
        return instance;
    }
    private Model(){
        mdb = new MedicinesDOMBuilder();
        msb = new MedicinesSAXBuilder();
    }
    public MedicinesDOMBuilder getMdb(){
        return mdb;
    }
    public MedicinesSAXBuilder getMsb(){
        return msb;
    }
    public void parseDOM(){
        File file = new File("C:\\Users\\Оксана\\Desktop\\JavaTraining\\WebApp\\src\\main\\resources\\medicins.xml");
        mdb.buildSetMedicines(file);
    }
    public void parseSax(){
        msb.getMedicines();
    }
}
