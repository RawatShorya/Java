package DesignPatterns.FactoryMethod;

public class EmailCreator extends NotificationCreator{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
