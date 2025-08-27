//package Collections.List.LinkedList;
//
//public class MyLinkedList<E> {
//    private static class Node<E> {
//        E item;
//        Node<E> next;
//        Node<E> prev;
//
//        Node(Node<E> prev, E element, Node<E> next) {
//            this.item = element;
//            this.next = next;
//            this.prev = prev;
//        }
//    }
//
//    private Node<E> first;
//    private Node<E> last;
//    private int size = 0;
//
//    public int getSize() {
//        return this.size;
//    }
//
//    public boolean isEmpty() {
//        return this.size == 0;
//    }
//
//    public void add(E e){
//        Node<E> newNode = new Node<>(last, e, null);
//        if (last == null){
//            first = newNode;
//        }else {
//            last.next = newNode;
//        }
//        last = newNode;
//        size++;
//    }
//
//    public E get(int index){
//        checkIndex(index);
//        Node<E> x;
//
//    }
//}
