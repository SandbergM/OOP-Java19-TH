package com.company;

public class Snake extends Creature {
    public Snake(String name, Gender gender){
        super(name, gender);
    }

    @Override
    public void sayHello() {
        System.out.printf("\n\t%s hisses, sssssss", this.getName());
    }

    @Override
    public void greeting() {
        System.out.printf("\n\t%s slithers in a friendly manor greet you", this.getName());
    }
}