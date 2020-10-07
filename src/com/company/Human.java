package com.company;

public class Human {

    private final String name;

    public Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.printf("\n\tHello, my name is %s", this.name);
    }
}
