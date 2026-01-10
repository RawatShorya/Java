package DesignPatterns.FactoryMethod.Notification;

public class EmailNotification implements Notification {
  @Override
  public void send(String msg) {
    System.out.println("Email sent: " + msg);
  }
}
