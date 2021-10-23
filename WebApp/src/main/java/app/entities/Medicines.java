package app.entities;

import java.util.Date;

public class Medicines {

    private String name;
    private String pharm;
    private String group;
    private String analog;
    private String version;
    private Certificate certificate;
    private Package pack;
    private Dosage dosage;

    public Medicines(String name, String pharm, String group, String analog, String version, Certificate certificate,
                     Package pack,Dosage dosage){
        this.name = name;
        this.pharm = pharm;
        this.group = group;
        this.analog = analog;
        this.version = version;
        this.certificate = certificate;
        this.pack = pack;
        this.dosage = dosage;
    }
    public Medicines(){}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPharm(String pharm){
        this.pharm = pharm;
    }
    public String getPharm(){
        return pharm;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
        return group;
    }
    public void setAnalog(String analog){
        this.analog = analog;
    }
    public String getAnalog(){
        return analog;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public String getVersion(){
        return version;
    }
    public void setCertificate(Certificate certificate){
        this.certificate = certificate;
    }
    public Certificate getCertificate(){
        return certificate;
    }
    public void setPack(Package pack){
        this.pack = pack;
    }
    public Package getPack(){
        return pack;
    }
    public void setDosage(Dosage dosage){
        this.dosage = dosage;
    }
    public Dosage getDosage(){
        return dosage;
    }
    public String toString(){
        return   "Name: "+ name
                +"\nPharm: "+pharm
                +"\nGroup: "+group
                +"\nAnalog "+analog
                +"\nCurrent version - "+version
                +"\n"+certificate.toString()
                +"\nPackage: "+pack.toString()
                +"\n"+dosage.toString();
                //+"\n-----------------------------------------";
    }
    public static class Certificate{
        private long number;
        private Date date_of_issue;
        private Date expiry_date;
        private String organization;

        public Certificate(long number,Date iss,Date exp,String organization){
            this.number = number;
            this.date_of_issue = iss;
            this.expiry_date = exp;
            this.organization = organization;
        }
        public Certificate(){}

        public void setNumber(long number){
            this.number = number;
        }
        public long getNumber(){
            return number;
        }
        public void setDate_of_issue(Date date){
            this.date_of_issue = date;
        }
        public Date getDate_of_issue(){
            return date_of_issue;
        }
        public void setExpiry_date(Date date){
            this.expiry_date = date;
        }
        public Date getExpiry_date(){
            return expiry_date;
        }
        public void setOrganization(String organization){
            this.organization = organization;
        }
        public String getOrganization(){
            return organization;
        }
        public String toString(){
            return "Certificate number: "+number+", issue date: "+date_of_issue+" , exp. date: "+expiry_date+" org: "+organization;
        }
    }
    public static class Package{
        private String type;
        private int count;
        private double price;

        public Package(String type,int count,double price){
            this.type = type;
            this.count = count;
            this.price = price;
        }
        public Package(){}
        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return type;
        }
        public void setCount(int count){
            this.count = count;
        }
        public int getCount(){
            return count;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public double getPrice(){
            return price;
        }
        public String toString(){
            return "Type "+type+", Count "+count+", Price "+price;
        }
    }
    public static class Dosage{
        private double dose;
        private String use;

        public Dosage(double dose,String use){
            this.dose = dose;
            this.use = use;
        }
        public Dosage(){}
        public void setDose(double dose){
            this.dose = dose;
        }
        public double getDose(){
            return dose;
        }
        public void setUse(String use){
            this.use = use;
        }
        public String getUse(){
            return use;
        }
        public String toString(){
            return "Dose: "+dose
                    +"\nUse for: "+use;
        }
    }
}
