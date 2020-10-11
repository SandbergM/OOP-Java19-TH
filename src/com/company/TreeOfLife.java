package com.company;

import java.util.ArrayList;

public class TreeOfLife {

    private TreeOfLife(){};
    private static final ArrayList<Apple> apples = new ArrayList<>();

    private static TreeOfLife single_instance = null;

    public static TreeOfLife getInstance(){
        if (single_instance == null){
            growApples();
            single_instance = new TreeOfLife();
        }
        return single_instance;
    }

    private static void growApples(){
        // A tree should have some apples right?
        for(int i = 0 ; i < 10 ; i++){
            apples.add(new Apple( (i % 2 == 0 ? Apple.Color.GREEN : Apple.Color.RED) ));
        }
    }

    public Apple takeApple(){
        // if an apple is picked, return it to the "picker", and remove it from the TreeOfLife's array
        Apple apple = apples.get(0);
        apples.remove(0);
        return apple;
    }
}