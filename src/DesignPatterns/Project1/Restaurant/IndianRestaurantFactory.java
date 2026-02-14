package DesignPatterns.Project1.Restaurant;

public class IndianRestaurantFactory implements RestaurantFactory{
    @Override
    public Menu createMenu() {
        return new IndianMenu();
    }

    @Override
    public Packaging createPackaging() {
        return new EcoFriendlyPackaging();
    }
}
