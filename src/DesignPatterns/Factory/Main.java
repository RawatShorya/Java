package DesignPatterns.Factory;

public class Main {
  public static void main(String[] args) {
    NotificationFactory factory;
    String channel = "email";
    switch (channel) {
      case "email":
        factory = new EmailFactory();
        break;
      case "sms":
        factory = new SMSFactory();
        break;
      case "push":
        factory = new PushFactory();
        break;
      default:
        throw new IllegalArgumentException("Unknown channel: " + channel);
    }
    Notification notification = factory.createNotification();
    notification.notifyUser();
  }
}
