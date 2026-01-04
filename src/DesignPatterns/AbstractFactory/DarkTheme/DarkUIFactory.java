package DesignPatterns.AbstractFactory.DarkTheme;

import DesignPatterns.AbstractFactory.Button;
import DesignPatterns.AbstractFactory.Checkbox;
import DesignPatterns.AbstractFactory.UIFactory;

public class DarkUIFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new DarkButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new DarkCheckBox();
  }
}
