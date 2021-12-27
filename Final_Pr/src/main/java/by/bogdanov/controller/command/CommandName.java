package by.bogdanov.controller.command;

public enum CommandName {
    REGISTRATION,
    LOGIN,
    READ_USER_CAR,
    READ_USER_ORDER,
    ADD_CAR,
    LOGOUT,
    SHOW_PRICES,
    SHOW_ORDERS,
    CREATE_ORDER,
    UPDATE_ORDER,
    SHOW_CLIENTS,
    CREATE_MANAGER,
    SHOW_ALL_CLEARANCE;

    public String getName(){
        return name();
    }
}
