package DesignPatterns.AbstractFactory;

public class Application {
  private final Button button;
  private final Checkbox checkbox;

  Application(UIFactory factory) {
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }

  void render() {
    button.render();
    checkbox.render();
  }
}
