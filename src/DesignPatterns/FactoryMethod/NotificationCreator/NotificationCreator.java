package DesignPatterns.FactoryMethod.NotificationCreator;

import DesignPatterns.FactoryMethod.Notification.Notification;

public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void notifyUser(String msg) {
        Notification n = createNotification();
        n.send(msg);
    }
}
