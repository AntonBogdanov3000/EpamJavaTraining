package by.bogdanov.entity;

import java.util.List;

public class Manager extends Entity{

    private int id;
    private String name;
    private String lastName;
    private List<Order> orderList;

    public Manager(){}

    public Manager(int id, String name, String lastName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public void setId(int id) {
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public String toString(){
        return "Manager id: " + this.id + " - " + this.name + " " + this.lastName + "\n";
    }

    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Manager manager = (Manager) obj;
        if(manager.id != this.id){
            return false;
        }
        if(manager.name != this.name){
            return false;
        }
        if(manager.lastName != this.lastName){
            return false;
        }
        return true;
    }
    public int hashCode(){
        final int number = 31;
        int result = 1;
        result = number * result + id;
        result = number * result + name.hashCode();
        result = number * result + lastName.hashCode();
        return result;
    }
}
