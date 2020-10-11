package com.company;

import java.util.ArrayList;

public abstract class Creature {

    private Creature spouse;
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
        System.out.printf("\n\t%ss family tree : ", this.name);
        showSpouse();
        listGrandparents();
        listParents();
        listSiblings();
        System.out.println("\n");
    }

    public void presentYourself(){
        sayHello();
        greeting();
    }

    public void addSpouse(Creature creature){
        // Check if the creature already has a spouse, only one allowed per creature
        if(spouse == null){
            spouse = creature;

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
            // Check if the parent already is in parents, no duplicates allowed
            if(!this.parents.contains(parent)){
                this.parents.add(parent);
            }
        }
    }

    public void addChild(Creature... children){
        for(Creature child : children){
            // Check if the child already is in children, no duplicates allowed
            if(!this.children.contains(child)){
                this.children.add(child);
            }
        }
    }

    private void listParents(){
        for(Creature parent: parents){
            System.out.printf("\n\t%s is a child to %s",this.name, parent.getName());
        }
    }

    private void listGrandparents(){
        for(Creature parent: parents){
            for(Creature grandparent : parent.getParents()){
                System.out.printf("\n\t%s is a grandchild to %s", this.name, grandparent.getName());
            }
        }
    }

    private void showSpouse(){
        if(this.spouse != null){
            System.out.printf("\n\t%s is a spouse to %s", this.spouse.name, this.name);
        }
    }

    private void listChildren(){
        for(Creature child: children){
            System.out.printf("\n\t%s is a parent to %s", this.getName(), child.getName());
        }
    }

    private void listSiblings(){
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

    public Creature getSpouse() {return spouse;}
    public ArrayList<Creature> getParents() {return parents;}
    public ArrayList<Creature> getChildren() {return children;}

    public abstract void sayHello();
    public abstract void greeting();
}
