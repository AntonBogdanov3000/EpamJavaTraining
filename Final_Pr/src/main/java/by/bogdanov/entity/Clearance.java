package by.bogdanov.entity;

import java.util.Date;
import java.util.List;

public class Clearance extends Entity{

    private long id;
    private String name;
    private Date startDate;
    private Date endDate;
    private List<Order> orderList;

    public Clearance(){}
    public Clearance(long id, String name, Date startDate, Date endDate){
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    public String toString(){
        return "Id: " + this.id + "\n"
                +"Clearance name: " + this.name + "\n"
                +"Start / End: " + this.startDate + " / " + this.endDate + "\n";
    }
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Clearance clearance = (Clearance) obj;
        if(clearance.id != this.id){
            return false;
        }
        if(clearance.name != this.name){
            return false;
        }
        if(clearance.startDate != this.startDate){
            return false;
        }
        if(clearance.endDate != this.endDate){
            return false;
        }
        if(clearance.orderList != this.orderList){
            return false;
        }
        return true;
    }
    public int hashCode(){
        final int number = 31;
        int result = 1;
        result = number * result + (int) id;
        result = number * result + name.hashCode();
        result = number * result + startDate.hashCode();
        result = number * result + endDate.hashCode();
        result = number * result + orderList.hashCode();
        return result;
    }
}
