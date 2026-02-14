package DesignPatterns.Project1.OrderPack;

public class DineInOrderService extends OrderService{
    @Override
    protected Order createOrder() {
        return new DineInOrder();
    }

}
