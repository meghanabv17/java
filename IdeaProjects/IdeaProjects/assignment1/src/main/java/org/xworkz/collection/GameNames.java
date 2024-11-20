package org.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GameNames {

    public static void main(String[] args) {
        Collection game = new ArrayList();
        Collection game1 = new ArrayList();
        game.add("Cricket");
        game.add("Hockey");
        game.add("Badmiton");
        game.add("Kabaddi");
        game1.add("Archery");
        game1.add("Athletics");
        game1.add("Baseball");
        game.addAll(game1);

        System.out.println("Contains: "+game.contains("Cricket"));
        System.out.println("Contains all: "+game.containsAll(game1));
        System.out.println("The game names are: "+game);
        System.out.println(game1.remove("Baseball"));
        System.out.println(game.removeAll(game1));
        System.out.println(game1);
        System.out.println("The size is: "+game);
        System.out.println("Retains: "+game.retainAll(game1));
        game.clear();
        System.out.println("After clear: "+game);

        List game2 = new ArrayList();
        List game3 = new ArrayList();
        game2.add("Bowling");
        game2.add("Chess");
        game2.add(0,"Deadlifting");
        game3.add("Golf");
        game3.add("Boxing");
        game2.addAll(0,game3);
        System.out.println("The list game are: "+game2);

    }
}
