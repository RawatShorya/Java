package DesignPatterns.Factory.Impls;

import DesignPatterns.Factory.Notification;

public class SMSNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending an SMS notification...");
  }
}
