package com.company;

public class CommandmentFactory {

    public static Commandment createCommandment(int number){
        return switch (number) {
            case 0 ->(new Commandment("I am the Lord thy God, thou shalt not have any strange gods before Me."));
            case 1 ->(new Commandment("Thou shalt not take the name of the Lord thy God in vain."));
            case 2 ->(new Commandment("Remember to keep holy the Sabbath day."));
            case 3 ->(new Commandment("Honor thy father and mother."));
            case 4 ->(new Commandment("Thou shalt not kill."));
            case 5 ->(new Commandment("Thou shalt not commit adultery."));
            case 6 ->(new Commandment("Thou shalt not steal."));
            case 7 ->(new Commandment("Thou shalt not bear false witness against thy neighbor."));
            case 8 ->(new Commandment("Thou shalt not covet thy neighbor’s wife."));
            case 9 ->(new Commandment("Thou shalt not covet thy neighbor’s goods."));
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}