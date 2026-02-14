package DesignPatterns.Project1;

import DesignPatterns.Project1.Restaurant.IndianRestaurantFactory;
import DesignPatterns.Project1.Restaurant.Menu;
import DesignPatterns.Project1.Restaurant.Packaging;
import DesignPatterns.Project1.Restaurant.RestaurantFactory;

public class main {
    public static void main(String[] args) {
        RestaurantFactory factory =
                new IndianRestaurantFactory();

        Menu menu = factory.createMenu();
        Packaging packaging = factory.createPackaging();

    }
}
