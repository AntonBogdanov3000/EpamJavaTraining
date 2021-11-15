package by.bogdanov.entity;

import java.util.Date;

public class Order extends Entity {

    private long id;
    private int price;
    private Date date;
    private long userId;
    private Operation operation;

    public Order(){}
    public Order(long id, int price, Date date, long userId, Operation operation){
        this.id = id;
        this.price = price;
        this.date = date;
        this.userId = userId;
        this.operation = operation;
    }

    public void setId(long id) {
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
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public long getUserId() {
        return userId;
    }
    public void setOperation(Operation operation){
        this.operation = operation;
    }
    public Operation getOperation() {
        return operation;
    }
    public String toString(){
        return "Order " + this.price +" "+ this.date+"\n"
                + "* "+ this.operation;
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
        if(order.operation != this.operation){
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
        result = number * result + operation.hashCode();
        return result;
    }
}
