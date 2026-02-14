package DesignPatterns.Project1.OrderPack;

public abstract class OrderService {
    public void processOrder() {
        Order order = createOrder();
        order.prepare();
        order.pack();
    }

    protected abstract Order createOrder();

}
