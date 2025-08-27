package Collections.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
            System.out.println("Added: " + i + ", Size: " + list.getSize());
        }
        System.out.println("Element at index 5 = " + list.get(5));
        System.out.println("Total size = " + list.getSize());

    }
}
