package DesignPatterns.SimpleFactory;

public class SMSNotification implements Notification {

  @Override
  public void send(String message) {
    System.out.println("Sending message : " + message + " on sms channel");
  }
}
