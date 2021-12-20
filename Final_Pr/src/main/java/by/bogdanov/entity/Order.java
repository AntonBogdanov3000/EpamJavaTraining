package by.bogdanov.entity;

import java.util.Date;
import java.util.List;

public class Order extends Entity {

    private int id;
    private int price;
    private Date date;
    private int userId;
    private List<Operation> operationList;

    public Order(){}
    public Order(int id, int price, Date date, int userId){
        this.id = id;
        this.price = price;
        this.date = date;
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return userId;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }

    public String toString(){
        return "Client id: " + this.userId + "\n" +
                "Order id: " + this.id + "; Price: " + this.price + "\n" +
                this.date+"\n" + this.operationList;
    }
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Order order = (Order) obj;
        if(order.id != this.id){
            return false;
        }
        if(order.price != this.price){
            return false;
        }
        if(order.date != this.date){
            return false;
        }
        if(order.userId != this.userId){
            return false;
        }

        return true;
    }
    public int hashCode(){
        final int number = 31;
        int result = 1;
        result = number * result + (int) id;
        result = number * result + price;
        result = number * result + date.hashCode();
        result = number * result + (int) userId;
        return result;
    }
}
