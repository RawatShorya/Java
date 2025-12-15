package DesignPatterns.SimpleFactory;

import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {
        private static final Map<String, Supplier<Notification>> registry = Map.of(
                "email", EmailNotification::new,
                "sms", SMSNotification::new
        );

  public static Notification create(String type) {
    return registry.getOrDefault(type, EmailNotification::new).get();
  }
}
