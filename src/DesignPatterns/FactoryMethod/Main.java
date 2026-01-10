package DesignPatterns.FactoryMethod;

import DesignPatterns.FactoryMethod.NotificationCreator.NotificationCreator;
import DesignPatterns.FactoryMethod.NotificationCreator.SMSCreator;

public class Main {
    public static void main(String[] args){
        NotificationCreator creator = new SMSCreator();
        creator.notifyUser("Hi Shorya!");
    }
}
