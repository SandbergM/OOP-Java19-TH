package com.company;

public class Commandment {

    private final String commandment;

    public Commandment(String commandment){
        this.commandment = commandment;
    }

    @Override
    public String toString() {
        return commandment;
    }
}
