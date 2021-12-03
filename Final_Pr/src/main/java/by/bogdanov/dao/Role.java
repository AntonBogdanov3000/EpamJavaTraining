package by.bogdanov.dao;

public enum Role {
    ADMIN,
    USER;

    public String getName(){
        return name().toLowerCase();
    }
}
