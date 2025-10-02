package DesignPatterns.Factory;

import DesignPatterns.Factory.Impls.SMSNotification;

public class SMSFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
