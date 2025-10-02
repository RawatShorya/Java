package DesignPatterns.Factory;

import DesignPatterns.Factory.Impls.EmailNotification;

public class EmailFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
    return new EmailNotification();
    }
}
