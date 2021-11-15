package by.bogdanov.entity;

public class Vehicle extends Entity {

    private long id;
    private long userId;
    private String model;
    private String vinNumber;
    private int year;
    private int mileage;

    public Vehicle(){}
    public Vehicle(long id,long userId,String model,
                   String vin, int year, int mileage ){
        this.userId = userId;
        this.id = id;
        this.model = model;
        this.vinNumber = vin;
        this.year = year;
        this.mileage = mileage;
    }
    public void setUserId(long userId){
        this.userId = userId;
    }
    public long getUserId(){
        return userId;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setVinNumber(String vin){
        this.vinNumber = vin;
    }

    public String getVinNumber(){
        return vinNumber;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public int getMileage(){
        return mileage;
    }

    public String toString(){
        return this.model + " " + this.year + " " + this.mileage;
    }
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Vehicle vehicle = (Vehicle) obj;
        if(vehicle.id != this.id){
            return false;
        }
        if(vehicle.userId != this.userId){
            return false;
        }
        if(vehicle.model != this.model){
            return false;
        }
        if(vehicle.vinNumber != this.vinNumber){
            return false;
        }
        if(vehicle.year != this.year){
            return false;
        }
        if(vehicle.mileage != this.mileage){
            return false;
        }
        return true;
    }
    public int hashCode(){
        final int number = 31;
        int result = 1;
        result = number * result + (int) id;
        result = number * result + (int) userId;
        result = number * result + model.hashCode();
        result = number * result + vinNumber.hashCode();
        result = number * result + year;
        result = number * result + mileage;

        return result;
    }

}
