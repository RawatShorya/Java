package DesignPatterns.Project1.Restaurant;

public class ItalianRestaurantFactory implements RestaurantFactory{
    @Override
    public Menu createMenu() {
        return new ItalianMenu();
    }

    @Override
    public Packaging createPackaging() {
        return new PremiumPackaging();
    }
}
