package Telusko;

public class Node {
    int data;
    Node next;
    int count = 1;

    Node(int data) {
        this.data = data;

    }

    public int countNode(Node head) {

        Node current = head;

        while (head.next != null) {

            head.next = current;
            count = count + 1;
        }
        return count;

    }
}
