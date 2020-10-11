package com.company;

public class Human extends Creature{

    public Human(String name, Gender gender){
        super(name, gender);
    }

    @Override
    public void sayHello() {
        System.out.printf("\n\tHello, my name is %s", this.getName());
    }

    @Override
    public void greeting() {
        System.out.printf("\n\t%s waves with his/her hands greet you", this.getName());
    }
}