package by.bogdanov.entity;

public class User extends Entity {

    private long id;
    private String name;
    private String lastName;
    private String password;
    private String login;
    private String email;
    private Vehicle car;
    private Order order;

    public User(){}
    public User(long id, String name, String lastName, String password,String login,Vehicle car,
                String email, Order order){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.login = login;
        this.car = car;
        this.email = email;
        this.order = order;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return login;
    }
    public Vehicle getVehicle(){
        return car;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setOrder(Order order){
        this.order = order;
    }
    public Order getOrder(){
        return order;
    }

    public String toString(){
        return this.name +"\n"
                + this.lastName+"\n"
                + this.car+"\n"
                + this.order;
    }
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        User user = (User) obj;
        if(user.id != this.id){
            return false;
        }
        if(user.name != this.name){
            return false;
        }
        if(user.lastName != this.lastName){
            return false;
        }
        if(user.password != this.password){
            return false;
        }
        if(user.login != this.login){
            return false;
        }
        if(user.car != this.car){
            return false;
        }
        if(user.email != this.email){
            return false;
        }
        if(user.order != this.order){
            return false;
        }
        return true;
    }
    public int hashCode(){
        final int number = 31;
        int result = 1;
        result = number * result + (int)id;
        result = number * result + name.hashCode();
        result = number * result + lastName.hashCode();
        result = number * result + password.hashCode();
        result = number * result + login.hashCode();
        result = number * result + car.hashCode();
        result = number * result + email.hashCode();
        result = number * result + order.hashCode();

        return result;
    }
}
