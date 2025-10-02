package DesignPatterns.Factory;

import DesignPatterns.Factory.Impls.PushNotification;

public class PushFactory implements NotificationFactory {
  @Override
  public Notification createNotification() {
    return new PushNotification();
  }
}
