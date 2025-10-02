package Annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

    Cat cat = new Cat("Stella");
    if (cat.getClass().isAnnotationPresent(VeryImportant.class)) {
      System.out.println("Imp");
    } else {
      System.out.println("Not Imp");
    }

    for (Method method : cat.getClass().getDeclaredMethods()) {
      if (method.isAnnotationPresent(RunImmediately.class)) {
        RunImmediately annotations = method.getAnnotation(RunImmediately.class);
        for (int i = 0; i < annotations.times(); i++) {
          method.invoke(cat);
        }
      }
    }

    for (Field field : cat.getClass().getDeclaredFields()) {
      if (field.isAnnotationPresent(ImportantString.class)) {
        field.setAccessible(true);
        Object object = field.get(cat);
        System.out.println(object);
      }
    }
  }
}
