package com.company;

public class Bird extends Creature {
    public Bird(String name, Gender gender){
        super(name, gender);
    }

    @Override
    public void sayHello() {
        System.out.printf("%s chirps, chirp-chirp", this.getName());
    }
}