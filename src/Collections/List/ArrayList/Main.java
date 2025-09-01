package Collections.List.ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
//        for (int i = 1; i <= 20; i++) {
//            list.add(i);
//            System.out.println("Added: " + i + ", Size: " + list.getSize());
//        }
//        System.out.println("Element at index 5 = " + list.get(5));
//        System.out.println("Total size = " + list.getSize());

        List<String> list = List.of("A", "B", "C");
        Iterator<String> iterator = list.iterator();

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + ", Index: " + listIterator.nextIndex() + " ");
        }
        System.out.println();
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + ", Index: " + listIterator.previousIndex() + " ");
        }

        
    }
}
