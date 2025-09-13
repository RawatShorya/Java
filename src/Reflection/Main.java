package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args) throws Exception {
    Cat cat = new Cat("Stella", 6);
    Field[] fields = cat.getClass().getDeclaredFields();
    for (Field field : fields) {
      if (field.getName().equals("name")) {
        field.setAccessible(Boolean.TRUE);
        field.set(cat, "Jimmy McGill");
      }
    }

    Method[] methods = cat.getClass().getDeclaredMethods();
    for (Method method : methods) {
      if (method.getName().equals("heyThisIsPrivate")) {
        method.setAccessible(true);
        method.invoke(cat);
      }
    }
  }
}
