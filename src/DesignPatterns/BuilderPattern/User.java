package DesignPatterns.BuilderPattern;

public class User {
  private final String name;
  private final String email;
  private final int age;

  public User(Builder builder) {
    this.name = builder.name;
    this.email = builder.email;
    this.age = builder.age;
  }

  @Override
  public String toString() {
    return "Name : " + name + ", Email : " + email + ", Age : " + age;
  }

  public static class Builder {
    private String name;
    private String email;
    private int age;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }
}
