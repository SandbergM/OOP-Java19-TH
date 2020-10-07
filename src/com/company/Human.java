package com.company;

public class Human extends Creature{

    public enum Gender{
        MALE,
        FEMALE
    }

    public Gender gender;

    public Human(String name, Gender gender){
        super(name);
        this.gender = gender;
    }
}