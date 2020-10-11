package com.company;

public class Apple {

    enum Color{
        RED,
        GREEN
    }

    private final Color color;

    public Apple(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
