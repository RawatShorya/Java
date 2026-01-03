package DesignPatterns.FactoryMethod;

public class SMSNotification implements Notification {

  @Override
  public void send(String msg) {
    System.out.println("SMS sent: " + msg);
  }
}
