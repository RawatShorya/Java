package DesignPatterns.Factory.Impls;

import DesignPatterns.Factory.Notification;

public class EmailNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending an Email notification...");
  }
}
