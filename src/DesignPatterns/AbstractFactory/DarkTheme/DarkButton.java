package DesignPatterns.AbstractFactory.DarkTheme;

import DesignPatterns.AbstractFactory.Button;

public class DarkButton implements Button {
  @Override
  public void render() {
    System.out.println("Dark Button");
  }
}
