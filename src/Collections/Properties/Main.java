package Collections.Properties;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        try(FileInputStream fis = new FileInputStream("/Users/shoryarawat/Desktop/Files/Shorya/Java/src/Collections/Properties/application.properties")) {
            props.load(fis);
            String url = String.valueOf(props.get("db.url"));
            System.out.println(url);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
