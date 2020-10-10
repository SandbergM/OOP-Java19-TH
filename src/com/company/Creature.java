package com.company;

import java.util.ArrayList;

public abstract class Creature {

    private Creature[] spouse = new Creature[1];
    private ArrayList<Creature> parents;
    private ArrayList<Creature> children;

    public enum Gender{
        MALE,
        FEMALE
    }

    private final String name;

    public Creature(String name, Gender gender){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.printf("\n\tHello, my name is %s", this.name);
    }

    public void addSpouse(Creature creature){
        if(this.spouse[0] == null){
            this.spouse[0] = creature;
            System.out.printf("%s is now a spouse to %s",creature, this.name );
        }
        System.out.printf("%s already have a spouse!",this.name );
    }

    public void addParent(Creature creature){}
    public void addChild(Creature creature){}

}
