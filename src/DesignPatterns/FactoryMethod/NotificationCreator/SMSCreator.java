package DesignPatterns.FactoryMethod.NotificationCreator;

import DesignPatterns.FactoryMethod.Notification.Notification;
import DesignPatterns.FactoryMethod.Notification.SMSNotification;

public class SMSCreator extends NotificationCreator {
  @Override
  public Notification createNotification() {
    return new SMSNotification();
  }
}
