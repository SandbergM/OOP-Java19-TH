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
    private static Human male;
    private static Human female;
    private ArrayList<Commandment> commandments;
    private static Snake snake;

    public void visitEden(){
        snake = (Snake) CreatureFactory.createCreature("Snake", "Nachash");
        System.out.println("\n\tThis is the story of how it all came to be...");
        startTheTour();
    }
    private void startTheTour(){
        int step = 0;
        while(step < 10){
            step = nextStep(step);
            switch (step){
                case 1 -> God.createLight();
                case 2 -> createAdam();
                case 3 -> createEva();
                case 4 -> createTheTenCommandments();
                case 5 -> readCommandments();
            }
        }
    }
    private int nextStep(int step){
        System.out.println("\n\tPress enter to continue...");
        scanner.nextLine();
        return ++step;
    }
    private void createAdam(){
        male = God.createAdam("Adam");
        System.out.printf("\n\t%s has entered the story", male.getName());
        male.sayHello();
    }
    private void createEva(){
        female = God.createEve("Eve");
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
