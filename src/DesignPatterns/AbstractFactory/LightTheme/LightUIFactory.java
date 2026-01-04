package DesignPatterns.AbstractFactory.LightTheme;

import DesignPatterns.AbstractFactory.Button;
import DesignPatterns.AbstractFactory.Checkbox;
import DesignPatterns.AbstractFactory.UIFactory;

public class LightUIFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new LightButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new LightCheckbox();
  }
}
