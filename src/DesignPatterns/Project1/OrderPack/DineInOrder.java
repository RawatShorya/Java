package DesignPatterns.Project1.OrderPack;

public class DineInOrder implements Order {
    @Override
    public void prepare() {
        System.out.println("Creating food for Dine");
    }

    @Override
    public void pack() {
        System.out.println("Packing food for Dine");
    }
}
