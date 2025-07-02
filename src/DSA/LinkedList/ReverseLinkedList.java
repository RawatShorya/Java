package DSA.LinkedList;


class Node{
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
public class ReverseLinkedList {

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.print("Given Linked list : ");
        printList(head);
        Node pointer = reverseLinkedList(head);
        System.out.println();
        System.out.print("Reversed Linked list : ");
        printList(pointer);
    }

    private static Node reverseLinkedList(Node head) {
        Node prev = null, curr = head, next;

        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static void printList(Node node) {
        while (node!=null){
            if (node.next == null){
                System.out.print(node.data);
            }else {
                System.out.print(node.data + "->");
            }
            node = node.next;
        }
    }

}
