package DesignPatterns.Project1.Payment;

public class CardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Card");
    }
}
