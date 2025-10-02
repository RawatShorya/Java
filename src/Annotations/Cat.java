package Annotations;

@VeryImportant
public class Cat {
  @ImportantString private final String name;
  private int age;

  public Cat(String name) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @RunImmediately(times = 3)
  public void meow() {
    System.out.println("Meow Meow");
  }

  private void heyThisIsPrivate() {
    System.out.println("How did you call this ??");
  }

  public static void thisIsAPublicStaticMethod() {
    System.out.println("I'm public and static");
  }
}
