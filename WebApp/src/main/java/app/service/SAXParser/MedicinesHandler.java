package app.service.SAXParser;

import app.entities.Medicines;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MedicinesHandler extends DefaultHandler {
    private final StringBuilder currentValue = new StringBuilder();
     Set<Medicines> result;
     Medicines currentMedicines;
     Medicines.Certificate certificate;
     Medicines.Package aPackage;
     Medicines.Dosage dose;

     public Set<Medicines> getResult(){
         return result;
    }
    @Override
    public void startDocument(){
         result = new HashSet<>();
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
         currentValue.setLength(0);
         if(qName.equalsIgnoreCase("medicins")){
             currentMedicines = new Medicines();
             certificate = new Medicines.Certificate();
             aPackage = new Medicines.Package();
             dose = new Medicines.Dosage();
             currentMedicines.setCertificate(certificate);
             currentMedicines.setPack(aPackage);
             currentMedicines.setDosage(dose);
         }
    }
    public void endElement(String uri, String localName, String qName){
         if(qName.equalsIgnoreCase("name")){
             currentMedicines.setName(currentValue.toString());
         }
         if(qName.equalsIgnoreCase("pharm")){
             currentMedicines.setPharm(currentValue.toString());
         }
        if(qName.equalsIgnoreCase("group")){
            currentMedicines.setGroup(currentValue.toString());
        }
        if(qName.equalsIgnoreCase("analogs")){
            currentMedicines.setAnalog(currentValue.toString());
        }
        if(qName.equalsIgnoreCase("versions")){
            currentMedicines.setVersion(currentValue.toString());
        }
        if(qName.equalsIgnoreCase("number")){
            currentMedicines.getCertificate().setNumber(Long.parseLong(currentValue.toString()));
        }
        if(qName.equalsIgnoreCase("date_of_issue")){
            currentMedicines.getCertificate().setDate_of_issue(new Date());
        }
        if(qName.equalsIgnoreCase("expiry_date")){
           currentMedicines.getCertificate().setExpiry_date(new Date());
        }
        if(qName.equalsIgnoreCase("organization")){
            currentMedicines.getCertificate().setOrganization(currentValue.toString());
        }
        if(qName.equalsIgnoreCase("package_type")){
            currentMedicines.getPack().setType(currentValue.toString());
        }
        if(qName.equalsIgnoreCase("count")){
            currentMedicines.getPack().setCount(Integer.parseInt(currentValue.toString()));
        }
        if(qName.equalsIgnoreCase("price")){
            currentMedicines.getPack().setPrice(Integer.parseInt(currentValue.toString()));
        }
        if(qName.equalsIgnoreCase("dose")){
            currentMedicines.getDosage().setDose(Double.parseDouble(currentValue.toString()));
        }
        if(qName.equalsIgnoreCase("use")){
            currentMedicines.getDosage().setUse(currentValue.toString());
        }
        if(qName.equalsIgnoreCase("medicins")){
            result.add(currentMedicines);
        }
    }
    public void characters(char chars[], int start, int length){
         currentValue.append(chars,start,length);
    }
}