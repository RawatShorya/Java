package DesignPatterns.FactoryMethod;

public class SMSCreator extends NotificationCreator {
  @Override
  public Notification createNotification() {
    return new SMSNotification();
  }
}
