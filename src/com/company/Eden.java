package com.company;

import java.util.ArrayList;
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
    static Human male;
    static Human female;
    static Snake snake;
    private ArrayList<Commandment> commandments;

    public void visitEden(){
        snake = (Snake) CreatureFactory.createCreature("Snake", CreatureFactory.CreatureType.SNAKE_MALE);
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
                case 4 -> System.out.println("");
                case 5 -> createTheTenCommandments();
                case 6 -> readCommandments();
            }
        }
    }

    private int nextStep(int step){
        System.out.println("\n\tPress enter to continue...");
        scanner.nextLine();
        return ++step;
    }

    private void createAdam(){
        male = (Human) God.createCreature("Adam", CreatureFactory.CreatureType.HUMAN_MALE);
        System.out.printf("\n\t%s has entered the story", male.getName());
        male.sayHello();
    }

    private void createEva(){
        female = (Human) God.createCreature("Eve", CreatureFactory.CreatureType.HUMAN_FEMALE);
        System.out.printf("\n\t%s has entered the story", female.getName());
        female.sayHello();
    }

    private void createTheTenCommandments(){
        commandments = God.createCommandments();
    }
    private void readCommandments(){
        for(int i = 0 ; i < commandments.size() ; i++){
            System.out.println("\t" + (i+1) + "  " + commandments.get(i).toString());
        }
    }
}