package DesignPatterns.FactoryMethod;

public class Main {
    public static void main(String[] args){
        NotificationCreator creator = new SMSCreator();
        creator.notifyUser("Hi Shorya!");
    }
}
