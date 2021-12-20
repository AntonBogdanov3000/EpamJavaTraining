package by.bogdanov.controller.command;

public enum CommandName {
    REGISTRATION,
    LOGIN,
    READ_USER_CAR,
    READ_USER_ORDER,
    ADD_CAR,
    LOGOUT,
    SHOW_PRICES;

    public String getName(){
        return name();
    }
}
