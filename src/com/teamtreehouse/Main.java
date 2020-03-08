package com.teamtreehouse;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put("breakfast", "Waffles");
        meals.put("lunch", "Gyros");
        meals.put("dinner", "Enchiladas");

        System.out.println(meals.get("dinner"));

       String lunch = meals.remove("lunch");
       boolean hasLunch = meals.containsKey("lunch");
       boolean hasGyros = meals.containsValue("Gyros");
       int size = meals.size();

        System.out.println(lunch + " " + hasLunch + " " + hasGyros + " " + size );
    }
}
