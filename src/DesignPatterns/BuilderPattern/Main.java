package DesignPatterns.BuilderPattern;

public class Main {
  public static void main(String[] args) {
    User user = new User.Builder().age(1).build();
    System.out.println(user.toString());
  }
}
