package com.teamtreehouse;


import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<String>();
        groceryLine.add("Jerry");
        groceryLine.add("Sam");
        groceryLine.add("Amber");

        System.out.println(groceryLine);

//        groceryLine.remove("Sam");
        groceryLine.remove(1);
        System.out.println(groceryLine);

        String jerry = groceryLine.get(0);
        System.out.println(jerry);

        int amberIndex = groceryLine.indexOf("lmber");
//        negative if does not exist
        System.out.println(amberIndex);

        System.out.println(groceryLine.size());

        for(String name : groceryLine ) {
            System.out.println(name);
        }


    }
}
