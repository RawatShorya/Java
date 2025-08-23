package Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day2 {
  public static void main(String[] args) {
    Stream<String> stringStream = List.of("aa", "bb", "aa").stream();
    //        List<String> stringList = stringStream.toList();
    //        List<String> stringList = stringStream.collect(Collectors.toList());
    //        Set<String> setList = stringStream.collect(Collectors.toSet());
//    String csv = stringStream.collect(Collectors.joining(", "));

      Map<Character, Long> freq = "bananas".chars()
                      .mapToObj(c -> (char)c)
                              .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

//    System.out.println(freq);

    record Person(String name, int age, String city){}
    var people = List.of(
            new Person("A", 20, "blr"),
            new Person("B", 35, "blr"),
            new Person("C", 40, "mum")
    );

    Map<String, Double> avgAgeByCity = people.stream().collect(
            Collectors.groupingBy(Person::city, Collectors.averagingInt(Person::age))
    );
//    System.out.println(avgAgeByCity);

    Map<Boolean, List<Person>> parts = people.stream().collect(Collectors.partitioningBy(person -> person.age() > 35));
    System.out.println(parts);
  }
}
