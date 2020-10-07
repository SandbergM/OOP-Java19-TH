package com.company;

public abstract class Creature {
    private final String name;
    public Creature(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.printf("\n\tHello, my name is %s", this.name);
    }
}
