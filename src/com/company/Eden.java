package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Eden {

    private Eden(){};

    private static Eden single_instance = null;

    public static Eden getInstance(){
        if (single_instance == null){
            single_instance = new Eden();
        }
        return single_instance;
    }

    private static final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Creature> creaturesOfEden = new ArrayList<>();
    static Human adam;
    static Human eve;

    public void visitEden(){
        System.out.println("\n\tThis is the story of how it all came to be...");
        startTheTour();
    }

    private void startTheTour(){
        int step = 0;
        while(step < 10){
            step = nextStep(step);
            switch (step){
                case 1 -> God.presentYourself();
                case 2 -> createAdam();
                case 3 -> createEva();
                case 4 -> createAnimals();
                case 5 -> godCreateMoreHumans();
                case 6 -> meetTheCreaturesOfEden();
                case 7 -> readCommandments();
                case 8 -> eveStoleSomeApples();
            }
        }
    }

    private int nextStep(int step){
        System.out.println("\n\tPress enter to continue...");
        scanner.nextLine();
        return ++step;
    }

    private void createAdam(){
        System.out.print("\n\tGod was feeling kinda lonely so he created a friend");
        adam = (Human) God.createCreature("Adam", CreatureFactory.CreatureType.HUMAN_MALE);
        System.out.printf("\n\t%s has entered the story", adam.getName());
        adam.sayHello();
    }

    private void createEva(){
        System.out.printf("\n\tBut then %s was feeling kinda lonely so he gave him a wife", adam.getName());
        eve = (Human) God.createCreature("Eve", CreatureFactory.CreatureType.HUMAN_FEMALE);
        System.out.printf("\n\t%s has entered the story", eve.getName());
        eve.sayHello();

        adam.addSpouse(eve);
        eve.addSpouse(adam);
    }

    private void readCommandments(){
        ArrayList<Commandment> commandments = God.createCommandments();
        for(int i = 0; i < commandments.size() ; i++){
            System.out.println("\t" + (i+1) + "  " + commandments.get(i).toString());
        }
    }

    private void pushToCreaturesOfEden(Creature... creatures){
        creaturesOfEden.addAll(Arrays.asList(creatures));
    }

    private void createAnimals(){
        System.out.println("\n\tAnd then god created some animals and stuff");

        Creature snake1 = (Snake) God.createCreature("Buttercup", CreatureFactory.CreatureType.SNAKE_MALE);
        Creature snake2 = (Snake) God.createCreature("Minnie", CreatureFactory.CreatureType.SNAKE_FEMALE);

        snake1.addSpouse(snake2);
        snake2.addSpouse(snake1);

        Creature bird1 = (Bird) God.createCreature("Sunshine", CreatureFactory.CreatureType.BIRD_MALE);
        Creature bird2 = (Bird) God.createCreature("Kiwi", CreatureFactory.CreatureType.BIRD_FEMALE);
        bird1.addSpouse(bird2);
        bird2.addSpouse(bird1);

        pushToCreaturesOfEden(snake1,snake2,bird1,bird2);
    }

    private void godCreateMoreHumans(){

        System.out.println("\n\tAdam and Eve were getting kinda old, so God decided to give them some children");

        Creature child1 = (Human) God.createCreature("Adam jr", CreatureFactory.CreatureType.HUMAN_MALE);
        Creature child2 = (Human) God.createCreature("Eve jr", CreatureFactory.CreatureType.HUMAN_FEMALE);

        child1.addParent(eve, adam);
        child2.addParent(eve, adam);

        eve.addChild(child1, child2);
        adam.addChild(child1, child2);

        eve.listChildren();
        adam.listChildren();
        pushToCreaturesOfEden(child1,child2);
    }

    public void meetTheCreaturesOfEden(){
        for(Creature creature : creaturesOfEden){
            creature.displayHeritage();
        }
    }

    public void eveStoleSomeApples(){
        TreeOfLife.getInstance().takeApple();
        System.out.println("" +
                "\n\tSomewhere in this story, i think Eve was tricked into stealing some apples" +
                "\n\tfrom the Tree of life or something, and that made God kinda mad and stuff, so banned all the creatures from eden" +
                "\n\n\tAnd that's where the story ends, hope you enjoyed your stay and learned some stuff." +
                "\n\n\tHave a good one!");
    }
}