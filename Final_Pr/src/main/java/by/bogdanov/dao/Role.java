package by.bogdanov.dao;

public enum Role {
    ADMIN,
    USER,
    GUEST;

    public String getName(){
        return name().toLowerCase();
    }
}
