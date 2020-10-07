package com.company;

import java.util.ArrayList;

public class God {

    private God(){};

    private static God single_instance = null;

    public static God getInstance(){
        if (single_instance == null){
            single_instance = new God();
        }
        return single_instance;
    }

    public static void createLight(){
        System.out.println("" +
                "\n\tIn the beginning God created the heaven and the earth. " +
                "\n\tAnd the earth was without form, and void; and darkness was upon the face of the deep. " +
                "\n\tAnd the Spirit of God moved upon the face of the waters. " +
                "\n\tAnd God said, Let there be light: and there was light.");
    }

    public static Human createAdam(String name){
        System.out.println(
                "\n\tBut then God was kinda lonely and needed some company, so he created a Adam.");
        return (Human) CreatureFactory.createCreature("HumanMale", "Adam");
    }
    public static Human createEve(String name){
        System.out.println("" +
                "\n\tBut then Adam was kinda sad and lonely so God created a wife for him named Eve.");
        return (Human) CreatureFactory.createCreature("HumanFemale", "Eve");
    }
    public static ArrayList<Commandment> createCommandments(){
        System.out.println("" +
                "\n\tAnd then God created some rules and stuff, aka the 10 commandments");
        ArrayList<Commandment> commandments = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++){
            commandments.add(CommandmentFactory.createCommandment(i));
        }
        return commandments;
    }
}
