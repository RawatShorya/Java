package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day1 {
  public static void main(String[] args) {
    //        Stream<String> a = List.of("a", "bb", "ccc").stream();
    //        IntStream b = Arrays.stream(new int[] {1,2,3,4});
    //        Stream<Double> c = Stream.generate(Math::random).limit(5);
    //        Stream<Integer> d = Stream.iterate(1, n->n+1).limit(5);
    //        Stream<String> e = Stream.<String>builder().add("x").add("y").build();
    //        IntStream range = IntStream.rangeClosed(1,5);

    // Get the lengths of each String in the list
    Stream<Integer> lengthsStream =
        List.of("java", "streams", "are", "cool").stream().map(String::length);

    //      Above Stream is created, now to get result apply terminal operation. (collect, reduce,
    // forEach, toArray, count, min/max, anyMatch/allMatch/noneMatch, findFirst/findAny
    //
    // java
    // Copy
    // Edit)
    //    List<Integer> length = lengthsStream.toList();

    // Let's get the integers in sorted order
    //      List<Integer> lengthSorted = lengthsStream
    ////              .sorted() //Sort in lexicographical order, ascending
    ////              .sorted(Comparator.reverseOrder()) //Sort in descending order
    //              .sorted( //Sort two integers in stream using some condition
    //                      Comparator.comparingInt(
    //                              (Integer i) -> i % 2)
    //                              .thenComparingInt(i -> i)
    //              )
    //              .toList();

    //      Apply Filter
    List<Integer> length = lengthsStream.filter(i -> i > 3).sorted().toList();


    int sumOfSquares = IntStream.rangeClosed(1,5)
            .map(n -> n*n)
            .sum();
    System.out.println(sumOfSquares);
  }
}
