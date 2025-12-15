package DesignPatterns.SimpleFactory;

public class Main {
    public static void main(String[] args){
        Notification notification = NotificationFactory.create("email");
        notification.send("Hello!");

        Notification notification2 = NotificationFactory.create("sms");
        notification2.send("Hello1!");
    }
}
