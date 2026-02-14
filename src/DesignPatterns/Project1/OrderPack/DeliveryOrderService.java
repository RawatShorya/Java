package DesignPatterns.Project1.OrderPack;

public class DeliveryOrderService extends OrderService{
    @Override
    protected Order createOrder() {
        return new DeliveryOrder();
    }

}
