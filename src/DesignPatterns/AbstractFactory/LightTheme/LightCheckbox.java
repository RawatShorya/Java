package DesignPatterns.AbstractFactory.LightTheme;

import DesignPatterns.AbstractFactory.Checkbox;

public class LightCheckbox implements Checkbox {

  @Override
  public void render() {
    System.out.println("Light Checkbox");
  }
}
