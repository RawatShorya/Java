package Collections;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TypeCasting {
  public static void main(String[] args) {
    //    int[] arr = new int[] {1, 2, 3, 4, 5};
    ////    int[] -> List<Integer>
    ////    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    //          List<Integer> list = Arrays.asList(ArrayUtils.toObject(arr));
    //    System.out.println(list);
    ////    List<Integer> -> int[]
    //      int[] arr1 = ArrayUtils.toPrimitive(list.toArray(new Integer[0]));
    //    for (int x: arr1){
    //        System.out.println("Element : " + x);
    //    }

    //      List -> Set
    List<String> list = new ArrayList<>(Arrays.asList("z", "1", "2", "a", "4"));
//    Set<String> set = new HashSet<>(list);
    TreeSet<String> set = new TreeSet<>(list);
    System.out.println(set.pollFirst());
  }
}
