package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.DarkTheme.DarkUIFactory;

public class Main {
  public static void main(String[] args) {
    UIFactory factory = new DarkUIFactory();
    Application app = new Application(factory);
    app.render();
  }
}
