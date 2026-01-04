package DesignPatterns.AbstractFactory.LightTheme;

import DesignPatterns.AbstractFactory.Button;

public class LightButton implements Button {
  @Override
  public void render() {
    System.out.println("Light Button");
  }
}
