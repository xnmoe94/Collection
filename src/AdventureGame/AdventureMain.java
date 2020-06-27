package AdventureGame;

import java.util.*;

public class AdventureMain {

   private final  static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> tempExits = new HashMap<>();

        locations.put( 0 , new Location(0, "You are sitting in front of the computer learning java",tempExits ));
        tempExits = new HashMap<>();

                tempExits.put("W", 2);
                tempExits.put("E", 3);
                tempExits.put("S", 4);
                tempExits.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of the a road before a saml brick",tempExits));



        tempExits = new HashMap<>();
                tempExits.put("N", 5);

                tempExits.put("W", 1);

        locations.put(2, new Location(2, "You are a the top of the hill", tempExits));


        tempExits = new HashMap<>();
                tempExits.put("N", 1);
                tempExits.put("W", 2);
        locations.put(3, new Location(3, "You are inside a Building a well a house for a spring ", tempExits));


        tempExits = new HashMap<>();
                tempExits.put("S", 1);
                tempExits.put("W", 2);

        locations.put(4, new Location(4, "You are in the Valley, beside a stream", tempExits));

        Map<String, String > Coordination = new HashMap<String, String>();
        Coordination.put("QUIT", "Q");
        Coordination.put("WEST", "W");
        Coordination.put("NORTH", "N");
        Coordination.put("EAST", "E");
        Coordination.put("SOUTH", "S");


        int loc = 1;

        while (true) {
        System.out.println(locations.get(loc).getLocationDesc());
        if (loc == 0) {
        break;
        }




        Map<String, Integer> exists = locations.get(loc).getExits();
        System.out.println("Available exist: ");
        for (String exist : exists.keySet()) {
        System.out.print(exist + ", ");

        }

        System.out.println();


        String direction = scan.nextLine().toUpperCase();
        if (direction.length() > 1){
        String[] words = direction.split(" ");
        for (String word : words){
        if(Coordination.containsKey(word)){
        direction = Coordination.get(word);
        break;
        }
        }

        }
        if (exists.containsKey(direction)) {
        loc = exists.get(direction);

        }else {
        System.out.println("You can't go in that direction; ");
        }



        }














    }

}




























//    Scanner scan = new Scanner(System.in);
//        locations.put( 0 , new Location(0, "You are sitting in front of the computer learning java"));
//                locations.put(1, new Location(1, "You are standing at the end of the a road before a saml brick"));
//                locations.put(2, new Location(2, "You are a the top of the hill"));
//                locations.put(3, new Location(3, "You are inside a Building a well a house for a spring "));
//                locations.put(4, new Location(4, "You are in the Valley, beside a stream"));
//                locations.put(5, new Location(5, "You are in the forest"));
//
//
//
//
//
//
//
//                tempExits.put("W", 2);
//                tempExits.put("E", 3);
//                tempExits.put("S", 4);
//                tempExits.put("N", 5);
//
//
//
//                locations.get(2).addexit("N", 5);
//
//                tempExits.put("W", 1);
//
//
//                tempExits.put("N", 1);
//                tempExits.put("W", 2);
//
//
//                locations.get(5).addexit("N", 1);
//
//
//                Map<String, String > Coordination = new HashMap<String, String>();
//        Coordination.put("QUIT", "Q");
//        Coordination.put("WEST", "W");
//        Coordination.put("NORTH", "N");
//        Coordination.put("EAST", "E");
//        Coordination.put("SOUTH", "S");
//
//
//
//
//        int loc = 1;
//
//        while (true) {
//        System.out.println(locations.get(loc).getLocationDesc());
//        if (loc == 0) {
//        break;
//        }
//
//
//
//
//        Map<String, Integer> exists = locations.get(loc).getExits();
//        System.out.println("Available exist: ");
//        for (String exist : exists.keySet()) {
//        System.out.print(exist + ", ");
//
//        }
//
//        System.out.println();
//
//
//        String direction = scan.nextLine().toUpperCase();
//        if (direction.length() > 1){
//        String[] words = direction.split(" ");
//        for (String word : words){
//        if(Coordination.containsKey(word)){
//        direction = Coordination.get(word);
//        break;
//        }
//        }
//
//        }
//        if (exists.containsKey(direction)) {
//        loc = exists.get(direction);
//
//        }else {
//        System.out.println("You can't go in that direction; ");
//        }
//
//
//
//        }
//
//
////        String[] road = "You are standing at the end of a road before a small brick building".split("");
////
////        for (String i : road){
////            System.out.println(i);
////        }
////        System.out.println("=======================================");
////
////        String[] roads = "You are standing, at the end of a road before a small, brick building".split(",");
////
////        for (String i : roads){
////            System.out.println(i);
////        }
//
//
//        }

