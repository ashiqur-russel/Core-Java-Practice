package Telusko;

public class LinkedList {

    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            node = head;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }


    }

    public void showList() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;

        }
        System.out.println(node.data);

    }
}
