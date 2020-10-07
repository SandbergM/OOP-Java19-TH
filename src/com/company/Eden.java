package com.company;

import java.util.Scanner;

public class Eden {

    private static final Scanner scanner = new Scanner(System.in);
    private static Human male;
    private static Human female;

    public void visitEden(){
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
            }
        }
    }
    public int nextStep(int step){
        System.out.println("\n\tPress enter to continue...");
        scanner.nextLine();
        return ++step;
    }
    public void createAdam(){
        male = God.createAdam("Adam");
        System.out.printf("\n\t%s has entered the story", male.getName());
        male.sayHello();
    }
    public void createEva(){
        female = God.createEve("Eve");
        System.out.printf("\n\t%s has entered the story", female.getName());
        female.sayHello();
    }
}
