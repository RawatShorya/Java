package DesignPatterns.SimpleFactory;

public class EmailNotification implements Notification {
  @Override
  public void send(String message) {
    System.out.println("Sending message : " + message + " on email channel");
  }
}
