package com.company;

public class Bird extends Creature {
    public Bird(String name, Gender gender){
        super(name, gender);
    }

    @Override
    public void sayHello() {
        System.out.printf("\n\t%s chirps, chirp-chirp", this.getName());
    }

    @Override
    public void greeting() {
        System.out.printf("\n\t%s flaps their wings to greet you", this.getName());
    }
}