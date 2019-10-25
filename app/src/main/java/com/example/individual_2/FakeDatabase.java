package com.example.individual_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//from lab exercise
public class FakeDatabase {

    public static MenuItem getItemById(int itemID) {
        return menuItems.get(itemID);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<MenuItem> getAllItems() {
        return new ArrayList<MenuItem>((List) Arrays.asList(menuItems.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, MenuItem> menuItems = new HashMap<>();

    static {
        menuItems.put(1, new MenuItem(
                        1,
                        "BBQ Angus Burger",
                        "Gourmet 100% angus beef burger",
                10.0,
                R.drawable.bbq_angus
                ));
        menuItems.put(2, new MenuItem(
                2,
                "Big Big Burger",
                "Really big burger with double the size",
                12.0,
                R.drawable.big_big
        ));

        menuItems.put(3, new MenuItem(
                3,
                "BLT Burger",
                "Premium burger from the southwest",
                15.0,
                R.drawable.blt_burger
        ));

        menuItems.put(4, new MenuItem(
                4,
                "Cheese Burger",
                "Cheese burger now with extra thicker cheese",
                8.0,
                R.drawable.cheese
        ));

        menuItems.put(5, new MenuItem(
                5,
                "Fries with Cheese Sauce",
                "Fries added with tomato and cheese sauce",
                7.0,
                R.drawable.cheese_fries
        ));

        menuItems.put(6, new MenuItem(
                6,
                "Chicken Burger",
                "Crispy chicken with lettuce",
                8.0,
                R.drawable.chicken
        ));
        menuItems.put(7, new MenuItem(
                7,
                "Chicken Cheese Burger",
                "Burger with cheese and chicken",
                7.0,
                R.drawable.chicken_cheese
        ));
        menuItems.put(8, new MenuItem(
                8,
                "Classic Angus Burger",
                "Made with 100% angus beef",
                11.0,
                R.drawable.classic_angus
        ));
        menuItems.put(9, new MenuItem(
                9,
                "Double Beef Burger",
                "Comes with double the beef",
                11.0,
                R.drawable.double_beef
        ));
        menuItems.put(10, new MenuItem(
                10,
                "Double Cheese Burger",
                "100% double cheese burger",
                9.0,
                R.drawable.double_cheese
        ));
        menuItems.put(11, new MenuItem(
                11,
                "Fish n Cheese Burger",
                "Burger with fish and cheese",
                6.0,
                R.drawable.fish_cheese
        ));
        menuItems.put(12, new MenuItem(
                12,
                "Grilled Chicken Burger",
                "Premium grilled chicken burger",
                11.0,
                R.drawable.grilled_chicken
        ));
        menuItems.put(13, new MenuItem(
                13,
                "Grilled Deluxe Burger",
                "Super deluxe burger with beef",
                17.0,
                R.drawable.grilled_deluxe
        ));
        menuItems.put(14, new MenuItem(
                14,
                "Pounder Burger",
                "Now with extra thick beef",
                11.0,
                R.drawable.pounder
        ));
        menuItems.put(15, new MenuItem(
                15,
                "Fries with Salsa Sauce",
                "Fries added with tomato and salsa sauce",
                10.0,
                R.drawable.salsa_fries
        ));
        menuItems.put(16, new MenuItem(
                16,
                "Nuggets",
                "Now with 2 extra pieces",
                19.0,
                R.drawable.more_nuggets
        ));

    }
}
