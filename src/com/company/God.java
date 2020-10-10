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

    public static void presentYourself(){
        System.out.println("" +
                "\n\tIn the beginning God created the heaven and the earth. " +
                "\n\tAnd the earth was without form, and void; and darkness was upon the face of the deep. " +
                "\n\tAnd the Spirit of God moved upon the face of the waters. " +
                "\n\tAnd God said, Let there be light: and there was light.");
    }

    public static Creature createCreature(String name, CreatureFactory.CreatureType creatureType){
        return CreatureFactory.createCreature(name, creatureType);
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
