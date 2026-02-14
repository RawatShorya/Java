package DesignPatterns.Project1.OrderPack;

public class DeliveryOrder implements Order{
    @Override
    public void prepare() {
        System.out.println("Creating food for Delivery");
    }

    @Override
    public void pack() {
        System.out.println("Packing food for Delivery");
    }
}
