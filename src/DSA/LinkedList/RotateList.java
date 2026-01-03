package DSA.LinkedList;

public class RotateList {

  private static void printList(Node node) {
    while (node != null) {
      if (node.next == null) {
        System.out.print(node.data);
      } else {
        System.out.print(node.data + "->");
      }
      node = node.next;
    }
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    System.out.print("Given Linked list : ");
    printList(head);
    Node pointer = rotateLinkedList(head, 2);
    System.out.println();
    System.out.print("Rotated Linked list : ");
    printList(pointer);
  }

  private static Node rotateLinkedList(Node head, int k) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    int pivot = count - k - 1;
    temp = head;
    while (pivot > 0) {
      temp = temp.next;
      pivot--;
    }
    Node p = temp;
    Node n = temp.next;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = head;
    p.next = null;
    return n;
  }
}
