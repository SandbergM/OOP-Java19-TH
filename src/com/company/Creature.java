package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Creature {

    private Creature[] spouse = new Creature[1];
    private ArrayList<Creature> parents = new ArrayList<>();
    private ArrayList<Creature> children= new ArrayList<>();

    public enum Gender{
        MALE,
        FEMALE
    }

    private final String name;

    public Creature(String name, Gender gender){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSpouse(Creature creature){
        if(spouse[0] == null){
            spouse[0] = creature;
            System.out.printf("\n\t%s is now a spouse to %s", creature.getName(), this.getName());
            return;
        }
        System.out.printf("\n\t%s already has a spouse, cant get another one!", this.getName());
    }

    public void addParent(Creature... parents){
        this.parents.addAll(Arrays.asList(parents));
    }

    public void addChild(Creature... children){
        this.children.addAll(Arrays.asList(children));
    }

    public void listParents(){
        for(Creature parent: parents){
            System.out.printf("\n\t%s is a parent to %s", parent.getName(), this.name);
        }
    }

    public void listGrandparents(){
        for(Creature parent: parents){
            for(Creature grandparent : parent.getParents()){
                System.out.printf("\n\t%s is a grandparent to %s", grandparent.getName(), this.name);
            }
        }
    }

    public void listChildren(){
        for(Creature child: children){
            System.out.printf("\n\t%s is %ss child", child.getName(), this.getName());
        }
    }

    public void listSiblings(){
        for(Creature parent: parents){
            for(Creature sibling : parent.getChildren()){
                if(sibling != this){
                    System.out.printf("\n\t%s is a sibling to %s", sibling.getName(), this.name);
                }
            }
        }
    }
    public Creature getSpouse() {return spouse[0];}
    public ArrayList<Creature> getParents() {return parents;}
    public ArrayList<Creature> getChildren() {return children;}
    public abstract void sayHello();
}
