package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Creature {

    private final Creature[] spouse = new Creature[1];
    private final ArrayList<Creature> parents = new ArrayList<>();
    private final ArrayList<Creature> children= new ArrayList<>();

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

    public final void displayHeritage(){
        listGrandparents();
        listParents();
        listSiblings();
        System.out.println("\n\n\n");
    }

    public void addSpouse(Creature creature){
        if(spouse[0] == null){
            spouse[0] = creature;

            System.out.printf("\n\t%s the %s is now a spouse to %s the %s",
                    creature.getName(),
                    creature.getClass().getSimpleName() ,
                    this.getName(),
                    this.getClass().getSimpleName());

            return;
        }
        System.out.printf("\n\t%s already has a spouse, cant get another one!", this.getName());
    }

    public void addParent(Creature... parents){
        for(Creature parent : parents){
            if(!this.parents.contains(parent)){
                this.parents.add(parent);
            }
        }
    }

    public void addChild(Creature... children){
        for(Creature child : children){
            if(!this.children.contains(child)){
                this.children.add(child);
            }
        }
    }

    public void listParents(){
        for(Creature parent: parents){
            System.out.printf("\n\t%s is a child to %s",this.name, parent.getName());
        }
    }

    public void listGrandparents(){
        for(Creature parent: parents){
            for(Creature grandparent : parent.getParents()){
                System.out.printf("\n\t%s is a grandchild to %s", this.name, grandparent.getName());
            }
        }
    }

    public void listChildren(){
        for(Creature child: children){
            System.out.printf("\n\t%s is a parent to %s", this.getName(), child.getName());
        }
    }

    public void listSiblings(){
        ArrayList<Creature> siblings = new ArrayList<>();
        for(Creature parent: parents){
            for(Creature sibling : parent.getChildren()){
                if(sibling != this && !siblings.contains(sibling)){
                    siblings.add(sibling);
                }
            }
        }
        for(Creature sibling : siblings){
            System.out.printf("\n\t%s is a sibling to %s", sibling.getName(), this.name);
        }
    }

    public Creature getSpouse() {return spouse[0];}
    public ArrayList<Creature> getParents() {return parents;}
    public ArrayList<Creature> getChildren() {return children;}
    public abstract void sayHello();
}
