package com.company;

public class CreatureFactory {

    enum CreatureType{
        SNAKE_FEMALE,
        SNAKE_MALE,
        HUMAN_FEMALE,
        HUMAN_MALE
    }

    public static Creature createCreature(String name, CreatureType creatureType){
        return switch (creatureType) {
            case SNAKE_FEMALE ->(new Snake(name, Creature.Gender.FEMALE));
            case SNAKE_MALE -> (new Snake(name, Creature.Gender.MALE));
            case HUMAN_FEMALE ->(new Human(name, Creature.Gender.FEMALE));
            case HUMAN_MALE ->(new Human(name, Creature.Gender.MALE));
        };
    }
}