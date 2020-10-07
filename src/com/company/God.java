package com.company;

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
                "\n\tThe man called Adam was created when God “formed man of the dust of the ground, " +
                        "\n\tand breathed into his nostrils the breath of life; and man became a living soul”");
        return new Human(name);
    }
    public static Human createEve(String name){
        System.out.println("" +
                "\n\tOnly God could make a wife for Adam. " +
                "\n\tGod knew that Adam would need a wife; " +
                "\n\tGod loved man and did not want him to be alone. " +
                "\n\tGod created Eve from Adam's rib. with flesh.");
        return new Human(name);
    }
}
