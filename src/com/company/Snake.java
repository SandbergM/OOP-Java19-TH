package com.company;

public class Snake extends Creature {
    public Snake(String name, Gender gender){
        super(name, gender);
    }

    @Override
    public void sayHello() {
        System.out.printf("%s hisses, sssssss", this.getName());
    }

}