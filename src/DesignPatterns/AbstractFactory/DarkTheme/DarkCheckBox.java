package DesignPatterns.AbstractFactory.DarkTheme;

import DesignPatterns.AbstractFactory.Checkbox;

public class DarkCheckBox implements Checkbox {
  @Override
  public void render() {
    System.out.println("Dark Checkbox");
  }
}
