package DesignPatterns.FactoryMethod.NotificationCreator;

import DesignPatterns.FactoryMethod.Notification.EmailNotification;
import DesignPatterns.FactoryMethod.Notification.Notification;

public class EmailCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
