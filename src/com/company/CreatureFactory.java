package com.company;

public class CreatureFactory {

    public static Creature createCreature(String type, String name){
        return switch (type) {
            case "Snake" ->(new Snake(name));
            case "HumanMale" ->(new Human(name, Human.Gender.MALE));
            case "HumanFemale" ->(new Human(name, Human.Gender.FEMALE));
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}